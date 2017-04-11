package FactoryMode.gongchangMethod;

import FactoryMode.Operation;
import FactoryMode.Arithmetic.SubClass;

public class SubFactory implements iFactory {

	@Override
	public Operation createOperation() {
		return new SubClass();
	}

	
}
