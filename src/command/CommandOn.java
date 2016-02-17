package command;

public class CommandOn implements Command {

	private TV tv;
	
	public CommandOn(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.turnOn();
	}

}
