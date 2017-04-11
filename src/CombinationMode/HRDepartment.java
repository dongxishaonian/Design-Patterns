package CombinationMode;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {
	}

	@Override
	public void remove(Company company) {
	}

	@Override
	public void DisPlay(int cishu) {
		for(int i =0;i<cishu;i++){
			System.out.print("- ");
		}
		System.out.println(getName());
	}

	@Override
	public void doDuty() {
		System.out.println(getName()+"Ô±¹¤ÕÐÆ¸ÅàÑµ");
	}

	
}
