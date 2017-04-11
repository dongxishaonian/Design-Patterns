package StateMode.State;

import StateMode.Work;

public class NightStatus implements Status {

	@Override
	public void workOut(Work work) {
		if(work.isFlag()){
			System.out.println("今天不吃夜宵了   睡觉");
		}
		else{
			if(work.getNowTime()<21){
				System.out.println("九点了   我应该在吃夜宵了");
			}
			else{
				Status status = new SleepStatus();
				work.setStatus(status);
				work.workOut();
			}
		}
	}

}
