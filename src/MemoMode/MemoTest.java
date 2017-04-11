package MemoMode;

public class MemoTest {
	public static void main(String[] args) {
		Role role = new Role();
		role.init();
		role.showData();
		
		RoleCreater creater = new RoleCreater();
		creater.setRole(role.RoleSave());
		
		role.Fight();
		role.showData();
		
		role.RoleHuifu(creater.getRole());
		role.showData();
		
	}
}
