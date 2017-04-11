package PrototypeModelMode;

public class Resume implements Cloneable {
	
	private String name;
	private int age;
	private int sex;
	private workExperience experience;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public workExperience getExperience() {
		return experience;
	}

	public void setExperience(workExperience experience) {
		this.experience = experience;
	}
	
	
	public Resume() {
		super();
	}

	//构造器
	public Resume(String name) {
		super();
		this.name = name;
		experience = new workExperience();
	}
	
	//构造器
	public Resume(workExperience experience) throws CloneNotSupportedException {
		super();
		this.experience = (workExperience) experience.clone();
	}
	
	public void show(){
		System.out.println(name+" "+age+" "+sex+experience.getAddress()+" "+experience.getCompany());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = new Resume(this.experience);
//		Resume resume = new Resume();
//		resume.experience = this.experience;
		resume.name = this.name;
		resume.age = this.age;
		resume.sex = this.sex;
		return resume;
	}

	
}
