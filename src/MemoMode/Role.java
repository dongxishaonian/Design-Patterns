package MemoMode;

public class Role {
	private int xueLiang;
	private int ATC;
	private int JYZ;

	public void init(){
		this.xueLiang = 100;
		this.JYZ = 100;
		this.ATC = 100;
	}
	
	// 保存角色对象
	public RoleBeifeng RoleSave() {
		return (new RoleBeifeng(xueLiang, ATC, JYZ));
	}

	// 恢复角色的信息
	public void RoleHuifu(RoleBeifeng beifeng) {
		this.xueLiang = beifeng.getXueLiang();
		this.ATC = beifeng.getATC();
		this.JYZ = beifeng.getJYZ();
	}

	public void Fight() {
		this.ATC = 0;
		this.JYZ = 0;
		this.xueLiang = 0;
	}

	public void showData() {
		System.out.println(this.xueLiang + " " + this.ATC + " " + this.JYZ);
	}

	public int getXueLiang() {
		return xueLiang;
	}

	public void setXueLiang(int xueLiang) {
		this.xueLiang = xueLiang;
	}

	public int getATC() {
		return ATC;
	}

	public void setATC(int aTC) {
		ATC = aTC;
	}

	public int getJYZ() {
		return JYZ;
	}

	public void setJYZ(int jYZ) {
		JYZ = jYZ;
	}

}