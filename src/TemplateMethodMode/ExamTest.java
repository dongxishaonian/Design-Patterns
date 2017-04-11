package TemplateMethodMode;

public class ExamTest {

	public static void main(String[] args) {
		TestPaper paper;
		
		paper = new Student1();
		paper.jieda();
		
		paper = new Student2();
		paper.jieda();
	}
}
