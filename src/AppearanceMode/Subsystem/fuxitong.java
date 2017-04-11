package AppearanceMode.Subsystem;

public class fuxitong {

	private Sub1 sub1;
	private Sub2 sub2;
	private Sub3 sub3;

	
	public void init(){
		sub1 = new Sub1();
		sub2 = new Sub2();
		sub3 = new Sub3();
	}
	public void xietiao() {
		sub1.jianzao();
		sub2.jianzao();
	}
	
	public void   xietiao2(){
		sub2.jianzao();
		sub3.jianzao();
	}
}
