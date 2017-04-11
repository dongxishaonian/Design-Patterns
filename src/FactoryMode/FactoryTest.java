package FactoryMode;

import FactoryMode.abstractFactory.DataAccess;
import FactoryMode.gongchangMethod.SubFactory;
import FactoryMode.gongchangMethod.iFactory;

public class FactoryTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Operation oper ;
//		oper =  OperationFactory.createOperation("+");
//		iFactory factory = new AddFactory();
		
		oper = DataAccess.zhixingAdd();
		oper.setNum1(12);
		oper.setNum2(13);
		oper.gainResult();
		
		iFactory factory1 = new SubFactory();
		oper = factory1.createOperation();
		oper =  OperationFactory.createOperation("-");
		oper.setNum1(12);
		oper.setNum2(13);
		oper.gainResult();
		
	}
}
