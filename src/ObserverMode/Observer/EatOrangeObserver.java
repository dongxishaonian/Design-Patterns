package ObserverMode.Observer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EatOrangeObserver {

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
	
	public void stopEatOrange(GregorianCalendar calendar){
		System.out.println(name+" "+sex+" "+"停下吃桔子来工作"+calendar.getTime());
	}
	
}
