package ast;

public class EOpExp extends Exp {
	public String op;
	public Exp arg1;
	public Exp arg2;	
	public boolean parentheses;
	
	public EOpExp(String op, Exp arg1, Exp arg2) {
	  this(op, arg1, arg2, false);
	} 

	public EOpExp(String op, Exp arg1, Exp arg2, boolean parentheses) {
	  this.op = op;
	  this.arg1 = arg1;
	  this.arg2 = arg2;
		this.parentheses = parentheses;
	} 

	@Override
  public String toString() {
		String op_str = op;
		if (op.equals("&")) op_str = "&&";
		if (op.equals("|")) op_str = "||";
		String str = arg1.toString() + " " + op_str + " " + arg2.toString();
		return parentheses ? "(" + str + ")" : str;
	}
}
