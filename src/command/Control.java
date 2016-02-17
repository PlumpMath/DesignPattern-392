package command;

public class Control {
	private Command onCommand;
	private Command offCommand;
	private Command changeCommand;
	
	public Control(Command on, Command off, Command channel){
		onCommand = on;
		offCommand = off;
		changeCommand = channel;
	}
	
	public void turnOn() {
		onCommand.execute();
	}
	
	public void turnOff() {
		offCommand.execute();
	}
	
	public void changeChannel() {
		changeCommand.execute();
	}

}
