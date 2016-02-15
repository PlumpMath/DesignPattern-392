package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new Factory();
		ICar car = factory.createCar();
		car.show();
	}

}
