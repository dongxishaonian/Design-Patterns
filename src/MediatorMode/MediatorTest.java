package MediatorMode;

public class MediatorTest {

	public static void main(String[] args) {
		UnionOrg union = new UnionOrg();
		Country America = new USA(union);
		America.setName("USA");
		Country Japan = new Japan(union);
		Japan.setName("JPN");
		
		union.setJapan(Japan);
		union.setUsa(America);
		
		America.shenMing("小矮子  你要干嘛！");
		Japan.shenMing("大佬  我错了");
	}
}
