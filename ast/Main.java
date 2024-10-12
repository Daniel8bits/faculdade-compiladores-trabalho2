package ast;

import java.util.ArrayList;

public class Main {
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms) {
		this.vars = vars;
		this.coms = coms;
	}

	@Override
  public String toString() {
		String[] vars_str = new String[]{""};
    vars.stream().forEach(f -> vars_str[0] += "\t" + f.toString());

		String[] coms_str = new String[]{""};
    coms.stream().forEach(f -> coms_str[0] += "\t" + f.toString());

		return "int main(void) {\n" + vars_str[0] + "\n\n" + coms_str[0] + "\treturn 0;\n}\n";// + "\n\n" + coms_str[0];
	}
}
