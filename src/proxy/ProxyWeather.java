package proxy;

public class ProxyWeather implements IWeather {

	RealWeather realWeather = new RealWeather();
	@Override
	public void display(String weather) {
		// TODO Auto-generated method stub
		realWeather.display(weather);

	}

}
