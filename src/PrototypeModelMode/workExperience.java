package PrototypeModelMode;

public class workExperience implements Cloneable {
	private String Address;
	private  String Company;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public workExperience(String address, String company) {
		super();
		Address = address;
		Company = company;
	}
	public workExperience() {
		super();
	}
	
	///实现克隆类
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	

}
