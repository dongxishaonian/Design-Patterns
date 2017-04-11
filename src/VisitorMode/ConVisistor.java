package VisitorMode;
/**
 * 状态
 * @author 83771
 *
 */
public class ConVisistor extends Visitor {

	@Override
	public void visitConcreteElementA(Aelement aelement) {

		System.out.println(aelement.getClass().getName()+"元素被"+this.getName()+"访问");
	}

	@Override
	public void visitConcreteElementB(Belement belement) {
		System.out.println(belement.getClass().getName()+"元素被"+this.getName()+"访问");
	}

}
