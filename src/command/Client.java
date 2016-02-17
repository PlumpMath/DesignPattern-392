package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Command onCommand = new CommandOn(tv);
		Command offCommand = new CommandOff(tv);
		Command channelCommond = new CommandChange(tv, 2);
		Control control = new Control(onCommand, offCommand, channelCommond);
		
		control.turnOn();
		control.turnOff();
		control.changeChannel();

	}

}
