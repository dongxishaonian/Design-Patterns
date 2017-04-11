package EnjoyYuanModel;

public abstract class Website {
private String name;
	
	
	public Website() {
		super();
	}


	public Website(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void use(User user);
}
