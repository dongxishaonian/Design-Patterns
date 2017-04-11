package AdapterMode;

public class AdapterPlay extends Player {
	ZgPlayer z1 = new ZgPlayer();

	
	@Override
	public void setName(String name) {
		super.setName(name);
		z1.setName(name);
	}

	@Override
	public void attack() {
		z1.Zattack();
	}

	@Override
	public void Defense() {
		z1.Zdenfense();
	}

}
