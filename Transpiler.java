import ast.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Transpiler {
  private final String OUT_DIR = "out/";
  private Prog prog;

  public Transpiler(Prog prog) {
    this.prog = prog;
  }

  public void print() {
    System.out.println(prog.toString());
  }

  public void transpile(String pathname) {
    File outDir = new File(OUT_DIR);
    if (!outDir.exists()) outDir.mkdirs();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUT_DIR + pathname))) {
				writer.write(prog.toString()); 
		} catch (IOException e) {
				System.out.println("Ocorreu um erro ao escrever o arquivo.");
				e.printStackTrace();
		}
	}

  public void compile(String pathname, String executableName) {
    transpile(pathname);
    sys("g++ " + pathname + " -o " + OUT_DIR + executableName);
  }

  private void sys(String command) {
    try {
      Process p = Runtime.getRuntime().exec(new String[]{"/usr/bin/sh", "-c", command});
      if (p.waitFor() != 0) {
        String errorMessage = new String(p.getErrorStream().readAllBytes());
        throw new Exception("Command failed! Command: " + command + "\nReason:\n" + errorMessage + "\n");
      }
      p.destroy();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}