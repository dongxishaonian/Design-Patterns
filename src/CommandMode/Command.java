package CommandMode;

public abstract  class Command {

	private Receiver receiver ;

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	public abstract void Excute();
	
}
