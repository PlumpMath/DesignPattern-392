package command;

public class TV {
	
	public int currentChannel = 0;
	
	public void turnOn(){
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
	
	public void changeChannel(int channel) {
		this.currentChannel = channel;
		System.out.println("now tv channel is " + channel);
	}

}
