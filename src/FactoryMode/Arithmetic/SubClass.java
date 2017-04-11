package FactoryMode.Arithmetic;

import FactoryMode.Operation;

/**
 * ºı∑®¿‡
 * @author 83771
 *
 */
public class SubClass extends Operation{

	@Override
	public double gainResult() {
		double num1=getNum1();
		double num2=getNum2();
		double result = num1- num2;
		setResulet(result);
		return getResulet();
	}

	
}
