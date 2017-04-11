package VisitorMode.example;

public class Success extends Status {

	@Override
	public void Manfanying(Man man) {
		System.out.println(man.getClass().getName()+man.getName()+"成功(man)");
	}

	@Override
	public void Womanfanying(Woman woman) {
		System.out.println(woman.getClass().getName()+woman.getName()+"成功(man)");
	}

}
