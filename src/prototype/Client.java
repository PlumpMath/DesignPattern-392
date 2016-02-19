package prototype;

/**
 * 原型模式
 * @author Jianyong
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i ++){
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show();
		}
	}

}
