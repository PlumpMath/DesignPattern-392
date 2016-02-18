package visitor;

public class Visitor implements IVisitor {

	@Override
	public void visit(ConcreteElement1 e1) {
		// TODO Auto-generated method stub
		e1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 e2) {
		// TODO Auto-generated method stub
		e2.doSomething();
	}

}
