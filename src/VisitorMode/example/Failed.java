package VisitorMode.example;

public class Failed extends Status {

	@Override
	public void Manfanying(Man man) {
		System.out.println(man.getClass().getName()+man.getName()+"Ê§°Ü(man)");

	}

	@Override
	public void Womanfanying(Woman woman) {
		System.out.println(woman.getClass().getName()+woman.getName()+"Ê§°Ü£¨woman£©");

	}

}
