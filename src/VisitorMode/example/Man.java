package VisitorMode.example;

public class Man extends Person {

	@Override
	public void fanyin(Status status) {
		status.Manfanying(this);
	}

}
