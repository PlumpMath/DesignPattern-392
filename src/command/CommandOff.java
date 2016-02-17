package command;

public class CommandOff implements Command {

	private TV tv;
	
	public CommandOff(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.turnOff();
	}

}
