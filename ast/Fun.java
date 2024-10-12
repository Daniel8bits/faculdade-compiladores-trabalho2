package ast;

import java.util.ArrayList;

public class Fun {
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(
		String nome,
		ArrayList<ParamFormalFun> params, 
		String retorno,
		ArrayList<VarDecl> vars,
		ArrayList<Comando> body
	) {
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	@Override
  public String toString() {
		String params_str = "";
		String param_str;
		String vardecl_str = "";
		String coms_str = "";
		String return_str = retorno;

		int greater_size = params.size() > vars.size() 
			? (params.size() > body.size() ? params.size() : body.size())
			: (vars.size() > body.size() ? vars.size() : body.size());

		for(int i = 0; i < greater_size; i++) {
			if (i < params.size()) {
				param_str = params.get(i).toString();
				params_str += (i+1 == params.size() ? param_str : param_str + ", ");
			}
			if (i < vars.size())
				vardecl_str += vars.get(i).toString();
			if (i < body.size())
				coms_str += "\t" + body.get(i).toString();
		}

		if (retorno.equals("boolean")) return_str = "bool";

		return return_str + " " + nome + "(" + params_str + ") {\n" + vardecl_str + coms_str + "}\n\n";
	}
}
