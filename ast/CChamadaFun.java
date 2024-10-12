package ast;

import java.util.ArrayList;

public class CChamadaFun extends Comando {
	public int linha;
	public String fun;
	public ArrayList<Exp> args;
	
	public CChamadaFun(int linha,String fun, ArrayList<Exp> args) {
	  this.linha = linha;
	  this.fun = fun;
	  this.args = args;
	}

	@Override
  public String toString() {
		String args_str = "";
		String exp_str;
		for(int i = 0; i < args.size(); i++) {
			exp_str = args.get(i).toString();
			args_str += (i+1 == args.size() ? exp_str : exp_str + ", ");
		}
		return fun + "(" + args_str + ");\n";
	}
}
