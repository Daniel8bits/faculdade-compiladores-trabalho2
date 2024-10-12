package ast;

import java.util.ArrayList;

public class Prog {
  public Main main;
  public ArrayList<Fun> fun;

  public Prog(Main main, ArrayList<Fun> fun) {
    this.main = main;
    this.fun = fun;
  }

  @Override
  public String toString() {
    String[] str = new String[]{""};
    fun.stream().forEach(f -> str[0] += f.toString());
    return "#include <iostream>\n\n" + str[0] + "\n" + main.toString();
  }
}

