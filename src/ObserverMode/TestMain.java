package ObserverMode;

import java.util.Calendar;

import ObserverMode.Observer.EatAppleObserver;
import ObserverMode.Observer.EatOrangeObserver;

public class TestMain {

	public static void main(String[] args) {
		Subject subject = new Subject();
		EatAppleObserver  eatAppleObserver = new EatAppleObserver();
		eatAppleObserver.setName("11");
		eatAppleObserver.setSex("man");
		EatOrangeObserver eatOrangeObserver  =  new EatOrangeObserver();
		eatOrangeObserver.setName("22");
		eatOrangeObserver.setSex("woman");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getClass());
		
		subject.addObserver(eatAppleObserver, "stopEatApple", calendar);
		subject.addObserver(eatOrangeObserver, "stopEatOrange",  calendar);
		
		subject.callUp();
	}
}
