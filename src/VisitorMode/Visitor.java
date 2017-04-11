package VisitorMode;

/**
 * 访问者 ： 可以访问得到A或B
 * @author 83771
 *
 */
public abstract class Visitor {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void visitConcreteElementA(Aelement aelement);
	public abstract void visitConcreteElementB(Belement belement);
	
}
