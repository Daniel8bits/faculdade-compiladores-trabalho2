package ast;

public class CPrint extends Comando {
	public int linha;
	public Exp exp;
	
	public CPrint(int linha, Exp exp) {
	  this.linha = linha;
	  this.exp = exp;	  
	}

	@Override
  public String toString() {
		/*
		if (exp instanceof ETrue) {
			ETrue eTrue = (ETrue) exp;
		} else if (exp instanceof EFalse) {
			EFalse eFalse = (EFalse) exp;
		} else if (exp instanceof EFloat) {
			EFloat eFloat = (EFloat) exp;
		} else if (exp instanceof EChamadaFun) {
			EChamadaFun eChamadaFun = (EChamadaFun) exp;
		} else if (exp instanceof EOpExp) {
			EOpExp eOpExp = (EOpExp) exp;
		}

		if (!(exp instanceof EVar)) {
			throw new RuntimeException();
		}

		EVar eVar = (EVar) exp;
		*/
		//return "printf(\"%s\", " /* + exp.toString()*/ + ");\n";
		return "std::cout << " + exp.toString() + " << std::endl;\n";
	}
}
