package SingletonMode;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2  = Singleton.getInstance();
		if(singleton1 == singleton2){
			System.out.println("两个实例为同一个");
		}else{
			System.out.println("二者为不同一个实例");
		}
	}
}
