package ProxyMode;

public class ProxyGiveYou implements GiveGift {

	//给我代理
	private GiveGift give;
	
	public ProxyGiveYou(Girl girl) {
		give = new cgGiveYou(girl);
	}
	@Override
	public void giveApple() {
		give.giveApple();
	}

	@Override
	public void giveOrange() {
		give.giveOrange();
	}

	@Override
	public void giveBanana() {
		give.giveBanana();
	}
	

}
