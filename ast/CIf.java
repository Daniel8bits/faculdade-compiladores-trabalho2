package ast;

import java.util.ArrayList;

public class CIf extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CIf(int linha,Exp exp, ArrayList<Comando> bloco) {
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	}

	@Override
  public String toString() {
		String coms_str = "";
		for (int i = 0; i < bloco.size(); i++) {
			coms_str += "\t" + bloco.get(i).toString();
		}

		return "\nif (" + exp.toString() + ") {\n" + coms_str + "}\n\n";
	}
}
