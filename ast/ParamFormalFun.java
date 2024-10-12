package ast;

public class ParamFormalFun {
  public String type;
  public String var;

  public ParamFormalFun(String type, String var) {
    this.type = type;
    this.var = var;
  }

  public String getType() {
    return type.equals("boolean") ? "bool" : type;
  }

  @Override
  public String toString() {
    return getType() + " " + var;
  }
}
