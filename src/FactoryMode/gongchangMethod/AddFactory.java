package FactoryMode.gongchangMethod;

import FactoryMode.Operation;
import FactoryMode.Arithmetic.AddClass;

public class AddFactory implements iFactory {

	@Override
	public Operation createOperation() {
		return new AddClass();
	}

	
}
