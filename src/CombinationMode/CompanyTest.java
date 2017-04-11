package CombinationMode;

public class CompanyTest {

	public static void main(String[] args) {

		ConcreteCompany companyRoot = new ConcreteCompany("全球总公司");
		companyRoot.add(new HRDepartment("总公司人力部"));
		companyRoot.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany comp = new ConcreteCompany("shanghai分公司");
		comp.add(new HRDepartment("华东人力部"));
		comp.add(new FinanceDepartment("华东财务部"));
		companyRoot.add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("hangzhou分公司");
		comp1.add(new HRDepartment("hangzhou人力部"));
		comp1.add(new FinanceDepartment("hangzhou财务部"));
		comp.add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("huzhou分公司");
		comp2.add(new HRDepartment("huzhou人力部"));
		comp2.add(new FinanceDepartment("huzhou财务部"));
		comp.add(comp2);
	
		companyRoot.DisPlay(1);
		System.out.println();
		companyRoot.doDuty();
		
	}

}
