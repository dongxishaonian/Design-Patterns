package ResponsibilityChainModel;

public class H2 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<10){
			System.out.println("我B已经处理了这件事");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
