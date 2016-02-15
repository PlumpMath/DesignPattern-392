package factory;

public class Factory implements IFactory{

	@Override
	public ICar createCar() {
		Engine engine = new Engine();
        UnderPan underpan = new UnderPan();
        Wheel wheel = new Wheel();
        ICar car = new Car(underpan, wheel, engine);
        return car;
	}

}
