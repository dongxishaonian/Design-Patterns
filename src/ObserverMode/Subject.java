package ObserverMode;

public class Subject extends Notifier  {

	@Override
	public void addObserver(Object object, String methodName, Object... args) {
		System.out.println("我是一个检查的同学");
		EventHandler eventHandler = this.getEventHandler();
		eventHandler.addEvent(object, methodName, args);
	}

	@Override
	public void callUp() {
		System.out.println("目标来了");
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
