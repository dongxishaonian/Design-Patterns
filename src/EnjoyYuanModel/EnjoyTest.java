package EnjoyYuanModel;

public class EnjoyTest {

	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website website =factory.gainWebsite("blog");
		website.use(new User("cg"));
		
		Website website1 =factory.gainWebsite("blog");
		website1.use(new User("sj"));
		
		Website website2 =factory.gainWebsite("shoping");
		website2.use(new User("zj"));
		
		Website website3 =factory.gainWebsite("shoping");
		website3.use(new User("jz"));
		
		Website website4 =factory.gainWebsite("blog");
		website4.use(new User("ch"));
		
		System.out.println(factory.getCount());
	}
}
