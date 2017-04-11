package ProxyMode;

public class cgGiveYou implements GiveGift {
	
	private Girl girl;
	
	public cgGiveYou(Girl girl) {
		this.girl = girl;
	}
	@Override
	public void giveApple() {
		System.out.println(girl.getName()+"给你一个苹果");
	}

	@Override
	public void giveOrange() {
		System.out.println(girl.getName()+"给你一个桔子");
	}

	@Override
	public void giveBanana() {
		System.out.println(girl.getName()+"给你一个香蕉");
	}

	
}
