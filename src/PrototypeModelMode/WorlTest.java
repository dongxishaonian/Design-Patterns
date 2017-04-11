package PrototypeModelMode;

public class WorlTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume  = new Resume("jeker_chen");
		resume.setAge(22);
		resume.setSex(1);
		workExperience  work = new workExperience("浙江省", "网易");
		resume.setExperience(work);
		
		Resume a = (Resume) resume.clone();
		Resume b = (Resume) resume.clone();
		Resume c = (Resume) resume.clone();
		
		b.setAge(23);
		c.setName("陈钢");
		work.setAddress("杭州");
		c.setExperience(work);
		
		a.show();
		b.show();
		c.show();
	}
}
