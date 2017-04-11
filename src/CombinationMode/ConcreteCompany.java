package CombinationMode;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	public ConcreteCompany(String name) {
		super(name);
	}

	List<Company> companies = new ArrayList<>();
	
	@Override
	public void add(Company company) {
		companies.add(company);
	}

	@Override
	public void remove(Company company) {
		companies.remove(company);
	}

	@Override
	public void DisPlay(int cishu) {
		for(int i =0;i<cishu;i++){
			System.out.print("- ");
		}
		System.out.println(getName());
		for(Company c : companies){
			c.DisPlay(cishu+2);
		}
	}

	@Override
	public void doDuty() {
		for(Company company : companies){
			company.doDuty();
		}
	}

	
}
