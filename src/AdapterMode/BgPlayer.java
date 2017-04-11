package AdapterMode;

public class BgPlayer extends Player {

	@Override
	public void attack() {
		System.out.println(getName()+"进行了进攻动作");
	}

	@Override
	public void Defense() {
		System.out.println(getName()+"进行了方式动作");
	}

	
}
