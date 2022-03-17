import absyn.*;

public class SemanticAnalyzer implements AbsynVisitor {

    public StringBuilder out;
    final static int SPACES = 4;
    
    public SemanticAnalyzer (StringBuilder out) {
        this.out = out;
    }

    public void visit( ExpList exp, int level ){}

    public void visit( AssignExp exp, int level ){}
  
    public void visit( IfExp exp, int level ){}
  
    public void visit( IntExp exp, int level ){}
  
    public void visit( OpExp exp, int level ){}
  
    public void visit( ReadExp exp, int level ){}
  
    public void visit( RepeatExp exp, int level ){}
  
    public void visit( VariableExp exp, int level ){}
  
    public void visit( ArrVariableExp exp, int level ){}
  
    public void visit( WriteExp exp, int level ){}
  
    public void visit (ArrayDeclaration exp, int level){}
  
    public void visit (DeclarationList exp, int level){}
  
    public void visit (VariableType exp, int level){}
  
    public void visit (NoValDeclaration exp, int level){}
  
    public void visit (CompoundStatement exp, int level){}
  
    public void visit (FunctionDeclaration exp, int level){}
  
    public void visit (VarDeclarationList exp, int level){}
  
    public void visit(CallExpression exp, int level){}
  
    public void visit(ReturnExp exp, int level){}
    
}