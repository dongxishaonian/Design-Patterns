package ObserverMode.Observer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EatAppleObserver {

	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void stopEatApple(GregorianCalendar calendar){
		System.out.println(name+" "+sex+" "+"停下吃苹果来工作"+calendar.getTime());
	}
//	public static void main(String[] args) {
//		EatAppleObserver observer = new EatAppleObserver();
//		observer.name="11";
//		observer.sex = "name";
//		new EatAppleObserver().stopEatApple(Calendar.getInstance());;
//	}
}
