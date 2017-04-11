package CommandMode;

public class Invoker {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void Excute(){
		command.Excute();
	}
	
}
