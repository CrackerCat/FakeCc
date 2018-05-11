package ast;
import type.*;
public class SizeofTypeNode extends ExprNode{
	 protected TypeNode operand;
	 protected TypeNode type;

	    public SizeofTypeNode(TypeNode operand, TypeRef type) {
	        this.operand = operand;
	        this.type = new TypeNode(type);
	    }

	    public Type operand() {
	        return operand.type();
	    }

	    public TypeNode operandTypeNode() {
	        return operand;
	    }

	    public Type type() {
	        return type.type();
	    }

	    public TypeNode typeNode() {
	        return type;
	    }

	    public Location location() {
	        return operand.location();
	    }
	    public void printTree(Dumper d){
	    	d.printMember("operand: ",operand);
	    }
	    public<S,E> E  accept(ASTVisitor<S, E> visitor){
	    	return visitor.visit(this);
	    }
}
