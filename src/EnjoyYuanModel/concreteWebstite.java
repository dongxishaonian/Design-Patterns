package EnjoyYuanModel;

public class concreteWebstite extends Website {

	
	
	@Override
	public void use(User user) {
		System.out.println("网站分类是："+getName()+"---使用者是："+user.getName());
	}

	
}
