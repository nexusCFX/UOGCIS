package absyn;

public interface AbsynVisitor {

  public void visit(ArrayDec arrayDec, int level);

  public void visit(AssignExp assignExp, int level);

  public void visit(CallExp callExp, int level);

  public void visit(CompoundExp compoundExp, int level);

  public void visit(DecList decList, int level);

  public void visit(ExpList expList, int level);

  public void visit(FunctionDec functionDec, int level);

  public void visit(IfExp ifExp, int level);

  public void visit(IndexVar indexVar, int level);

  public void visit(IntExp intExp, int level);

  public void visit(NameTy nameTy, int level);

  public void visit(NilExp nilExp, int level);

  public void visit(OpExp opExp, int level);

  public void visit(ReturnExp returnExp, int level);

  public void visit(SimpleDec simpleDec, int level);

  public void visit(SimpleVar simpleVar, int level);

  public void visit(VarDecList varDecList, int level);

  public void visit(VarExp varExp, int level);

  public void visit(WhileExp whileExp, int level);

  public void visit(ErrorExp errorExp, int level);

  public void visit(ErrorDec errorDec, int level);

  public void visit(ErrorVarDec errorVarDec, int level);
}
