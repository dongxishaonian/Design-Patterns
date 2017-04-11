package ObserverMode;

import java.util.LinkedList;
import java.util.List;

public class EventHandler {

	//使用一个List
	private List<Event> objs;

	public EventHandler() {
		super();
		objs = new LinkedList<>();
	}
	
	//添加某个事件
	public void addEvent(Object object,String methodName,Object...args){
		objs.add(new Event(object,methodName,args));   
	}
	
	//通知所有事件执行指定的事件
	public void notifyX() throws Exception{
		for( Event event: objs){
			event.invoke();
		}
	}
}
