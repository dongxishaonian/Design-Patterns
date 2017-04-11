package BuilderMode;

import BuilderMode.Product1.Orange;
import BuilderMode.Product1.Fruit;

public class OrangeBuilder implements Builder {

	private Fruit Orange = new Orange();
	@Override
	public void builderPart1() {
		Orange.addPart("½Û×ÓÒ¶×Ó");
	}

	@Override
	public void builderPart2() {
		Orange.addPart("½Û×ÓÆ¤");
	}

	@Override
	public Fruit getFruit() {
		return Orange;
	}

}
