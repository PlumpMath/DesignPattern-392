package factory;

public class Car implements ICar{
	UnderPan underPan;
	Wheel wheel;
	Engine engine;
	public Car(UnderPan underPan, Wheel wheel, Engine engine) {
		// TODO Auto-generated constructor stub
		this.underPan = underPan;
		this.wheel = wheel;
		this.engine = engine;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("制造汽车");
		
	}

}
