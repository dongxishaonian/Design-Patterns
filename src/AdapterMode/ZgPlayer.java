package AdapterMode;

public class ZgPlayer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Zattack(){
		System.out.println(name +"½ø¹¥");
	}
	
	public void Zdenfense(){
		System.out.println(name + "·ÀÊØ");
	}
}
