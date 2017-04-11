package ResponsibilityChainModel;

public class H1 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<5){
			System.out.println("我A已经处理了这件事");
		}else{
			getNextHandler().chuLi(jibie);
		}
	}

	
}
