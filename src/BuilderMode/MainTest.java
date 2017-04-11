package BuilderMode;

import BuilderMode.Product1.Fruit;

public class MainTest {

	public static void main(String[] args) {
		Directer directer = new Directer();
		 Builder builder = new AppleBuilder();
		 directer.build(builder);
		 
		 Fruit fruit = builder.getFruit();
		 fruit.complite();
	}
}
