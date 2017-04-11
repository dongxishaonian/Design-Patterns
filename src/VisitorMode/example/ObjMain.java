package VisitorMode.example;

import java.util.ArrayList;
import java.util.List;

public class ObjMain {

	private List<Person> list = new ArrayList<>();
	
	public void add(Person person){
		list.add(person);
	}
	public void remove(Person person){
		list.remove(person);
	}
	
	public void showData(Status status){
		for(Person person : list){
			person.fanyin(status);
		}
	}
}
