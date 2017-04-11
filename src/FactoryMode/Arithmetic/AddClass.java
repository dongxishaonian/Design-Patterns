package FactoryMode.Arithmetic;

import FactoryMode.Operation;

/**
 * 加法运算类
 * 
 * @author 83771
 *
 */
public class AddClass extends Operation {

	@Override
	public double gainResult() {
		double num1 = getNum1();
		double num2 = getNum2();
		setResulet(num1 + num2);
		return getResulet();
	}

}
