package ast;

public class VarDecl {
  public String type;
  public String var;

  public VarDecl(String type,String var) {
   this.type = type;
   this.var = var;
  }

  @Override
  public String toString() {
    String type_str = type.equals("boolean") ? "bool" : type;
    return type_str + " " + var + ";\n";
  }
}
