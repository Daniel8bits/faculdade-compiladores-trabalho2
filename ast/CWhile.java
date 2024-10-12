package ast;

import java.util.ArrayList;

public class CWhile extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CWhile(int linha, Exp exp, ArrayList<Comando> bloco) {
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	} 

	@Override
  public String toString() {
		String[] coms_str = new String[]{""};
    bloco.stream().forEach(f -> coms_str[0] += f.toString());

		return "\nwhile (" + exp.toString() + ") {\n" + coms_str[0] + "}\n\n";
	}
}
