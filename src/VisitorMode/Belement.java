package VisitorMode;
/**
 * BµÄ·´Ó¦
 * @author 83771
 *
 */
public class Belement implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	
}
