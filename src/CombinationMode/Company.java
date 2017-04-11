package CombinationMode;

public abstract class Company {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Company(String name) {
		super();
		this.name = name;
	}

	public abstract void add(Company company);
	public abstract void remove(Company company);
	public abstract void DisPlay(int cishu);
	public abstract void doDuty();
}
