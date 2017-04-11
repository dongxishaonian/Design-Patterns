package TemplateMethodMode;

public abstract class TestPaper {

	public abstract void timu01();
	public abstract void timu02();
	
	public void jieda(){
		timu01();
		timu02();
		System.out.println("½â´ğÍê±Ï£¡");
	}
}
