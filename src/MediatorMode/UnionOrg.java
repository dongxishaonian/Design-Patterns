package MediatorMode;

public class UnionOrg extends Union {

	private Country usa;
	private Country japan;
	
	
	public UnionOrg(Country usa, Country japan) {
		super();
		this.usa = usa;
		this.japan = japan;
	}

	
	
	public UnionOrg() {
		super();
	}



	public Country getUsa() {
		return usa;
	}

	public void setUsa(Country usa) {
		this.usa = usa;
	}

	public Country getJapan() {
		return japan;
	}

	public void setJapan(Country japan) {
		this.japan = japan;
	}

	@Override
	public void ShenMing(String Message, Country country) {
		if(country.getName().equals("USA")){
			japan.getMessage(Message);
		}
		else{
			usa.getMessage(Message);
		}
	}

	
}
