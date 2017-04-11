package StateMode.State;

import StateMode.Work;

public class SleepStatus implements Status {

	@Override
	public void workOut(Work work) {

		System.out.println("好啦   我要睡觉了");
	}

}
