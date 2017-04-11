package ResponsibilityChainModel;

public class H3 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<15){
			System.out.println("我C已经处理了这件事");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
