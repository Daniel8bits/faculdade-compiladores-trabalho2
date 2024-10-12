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
    String fun_str = "";
    String prototype_str = "";
    //fun.stream().forEach(f -> fun_str[0] += f.toString());

    for (int i = 0; i < fun.size(); i++) {
      fun_str += fun.get(i).toString();
      prototype_str += fun.get(i).getPrototype();
    }

    return "#include <iostream>\n\n" + prototype_str + "\n" + main.toString() + "\n" + fun_str;
  }
}

