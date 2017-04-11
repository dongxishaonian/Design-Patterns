package StateMode;

import StateMode.State.Status;

public class Work {

	private int nowTime;
	private boolean flag;
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getNowTime() {
		return nowTime;
	}

	public void setNowTime(int nowTime) {
		this.nowTime = nowTime;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Work(int nowTime, boolean flag) {
		super();
		this.nowTime = nowTime;
		this.flag = flag;
	}
	
	public Work(Status status) {
		super();
		this.status = status;
	}

	public void workOut() {
		status.workOut(this);
	}
}
