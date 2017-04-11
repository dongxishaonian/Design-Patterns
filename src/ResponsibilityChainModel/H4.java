package ResponsibilityChainModel;

public class H4 extends Handler {

	@Override
	public void chuLi(int jibie) {

		if(jibie<20){
			System.out.println("我D已经处理了这件事");
		}else{
			System.out.println("这件事不可能做的");
		}
	}

	
}
