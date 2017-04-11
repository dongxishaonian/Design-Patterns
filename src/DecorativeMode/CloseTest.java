package DecorativeMode;

import DecorativeMode.Dress.Slipper;
import DecorativeMode.Dress.Tshirt;

public class CloseTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("jeker_chen");
		
		Slipper slipper = new Slipper();
		Tshirt tshirt = new Tshirt();
		
		tshirt.Decorate( person);
		slipper.Decorate(tshirt);
		
		slipper.show();
		
	}

}
