package StateMode;

import StateMode.State.MorningStatus;

public class WorkTest {

	public static void main(String[] args) {
		Work work = new Work(new MorningStatus());
		work.setFlag(false);
		work.setNowTime(8);
		work.workOut();
		
		work.setNowTime(10);
		work.workOut();
		
		work.setNowTime(20);
		work.workOut();
		
		work.setNowTime(20);
		work.setFlag(true);
		work.workOut();
	}
}
