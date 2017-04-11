package VisitorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 能枚举他的元素，提供高层接口允许访问者访问他的元素
 * @author 83771
 *
 */
public class ObjectStructre {

	private List<Element> elements = new ArrayList<>();
	
	public void addElement(Element element){
		elements.add(element);
	}
	
	public void removeElement(Element element){
		elements.remove(element);
	}
	
	public void showData(Visitor visitor){
		for(Element element : elements){
			element.accept(visitor);
		}
	}
	
}
