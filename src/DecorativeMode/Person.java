package DecorativeMode;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println("把"+name+"给装扮了！");
	}
}
