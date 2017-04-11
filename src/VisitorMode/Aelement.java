package VisitorMode;
/**
 * AµÄ·´Ó¦
 * @author 83771
 *
 */
public class Aelement implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	
}
