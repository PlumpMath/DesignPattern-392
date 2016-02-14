package proxy;

public class Client {
	public static void main(String args[]) {
		IWeather weather = new ProxyWeather();
		weather.display("Sunny");
	}

}
