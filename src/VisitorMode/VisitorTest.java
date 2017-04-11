package VisitorMode;
/**
 * 访问者模式适用于数据结构稳定的情况下
 * 双分派
 * @author 83771
 *
 */
public class VisitorTest {

	public static void main(String[] args) {

		ObjectStructre structre = new ObjectStructre();
		structre.addElement(new Aelement());
		structre.addElement(new Belement());
		
		Visitor conVisistor = new ConVisistor();
		conVisistor.setName("陈钢");
		Visitor conVisistor1 = new ConVisistor2();
		conVisistor1.setName("沈洁");
		
		structre.showData(conVisistor);
		structre.showData(conVisistor1);
		System.out.println("-----------------");
		new Aelement().accept(conVisistor1);
		new Aelement().accept(conVisistor);
		
		
		
		
	}

}
