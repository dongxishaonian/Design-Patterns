package FactoryMode;

import FactoryMode.Arithmetic.AddClass;
import FactoryMode.Arithmetic.SubClass;

/**
 * π§≥ß¿‡
 * @author 83771
 *
 */
public class OperationFactory {

	public static Operation createOperation(String sign){
		Operation op = null;
		switch (sign) {
		case "+":
			op  = new AddClass();
			break;
		case "-":
			op  = new SubClass();
			break;
		default:
			break;
		}
		return op;
	}
}