package VisitorMode.example;

public class Smile extends Status {

	@Override
	public void Manfanying(Man man) {
		System.out.println(man.getName()+"Ð¦Á³");

	}

	@Override
	public void Womanfanying(Woman woman) {
		System.out.println(woman.getName()+"Ð¦Á³");
	}

}
