package FactoryMode.abstractFactory;

import FactoryMode.Operation;

public class DataAccess {
	private static final String  ADD = "FactoryMode.Arithmetic.AddClass"; 
	
	public static Operation  zhixingAdd() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String classname = ADD;
		Operation oper = (Operation) Class.forName(classname).newInstance();
		return oper;
	}

}
