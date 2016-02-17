package command;

public class CommandChange implements Command {

	private TV tv;
	
	private int channel;
	
	public CommandChange(TV tv, int channel) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
		this.channel = channel;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.changeChannel(channel);
	}

}
