package BridgingMode.MobileBrand;

import BridgingMode.Soft.MobileSoft;

public abstract class Mobile {

	private MobileSoft soft;

	public MobileSoft getSoft() {
		return soft;
	}

	public void setSoft(MobileSoft soft) {
		this.soft = soft;
	}
	
	public abstract void Run();
	
}
