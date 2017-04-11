package StateMode.State;

import StateMode.Work;

public class MorningStatus implements Status {

	@Override
	public void workOut(Work work) {
		if(work.getNowTime()<9){
			System.out.println("现在九点 我在吃早饭！");
		}
		else{
			Status status = new NoonStatus();
			work.setStatus(status);
			work.workOut();
			
		}
	}

}
