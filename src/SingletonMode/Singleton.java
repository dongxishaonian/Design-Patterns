package SingletonMode;

public class Singleton {

	//在此实例化的话为饿汉模式
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(instance == null){
			//在此为懒汉模式
			instance  = new Singleton();
		}
		return instance;
	}
}
