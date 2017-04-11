package StrategyMode.strategy;

import StrategyMode.ChargeClass;
/**
 * ·µÀûÄ£Ê½
 * @author 83771
 *
 */
public class RebateCharge extends ChargeClass {

	private double man;
	private double fan;
	
	public RebateCharge(double man, double fan) {
		super();
		this.man = man;
		this.fan = fan;
	}

	@Override
	public double accept(double money) {
		double result = money;
		if(money>=man){
			result = money - Math.floor(money/man)*fan;
		}
		return result;
	}

}
