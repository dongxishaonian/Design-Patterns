package BuilderMode.Product1;

import java.util.ArrayList;
import java.util.List;

public abstract class Fruit {

	protected List<String> parts = new ArrayList<String>();

	public void addPart(String part) {
		parts.add(part);
	}
	public abstract void complite();
}
