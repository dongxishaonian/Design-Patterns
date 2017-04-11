package ResponsibilityChainModel;

public class ChainTest {
	public static void main(String[] args) {
		Handler h1 =new H1();
		Handler h2 =new H2();
		Handler h3 =new H3();
		Handler h4 =new H4();
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		h3.setNextHandler(h4);
		
		int [] a = {5,6,7,8,1,12,2,34,54,23,12,14};
		
		for(int a1 : a){
			h1.chuLi(a1);
		}
	}
}
