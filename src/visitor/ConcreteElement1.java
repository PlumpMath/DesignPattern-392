package visitor;

public class ConcreteElement1 extends Element{

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("这是元素1");
	}

}
