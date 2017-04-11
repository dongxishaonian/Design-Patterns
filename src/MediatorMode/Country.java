package MediatorMode;

public abstract class Country {
	private Union union;
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Union getUnion() {
		return union;
	}

	public void setUnion(Union union) {
		this.union = union;
	}

	public Country(Union union) {
		super();
		this.union = union;
	}
	public void shenMing(String message){
		getUnion().ShenMing(message, this);
	}
	
	public void  getMessage(String message){
		System.out.println(this.name+"获得信息:"+message);
	}
	
	
}
