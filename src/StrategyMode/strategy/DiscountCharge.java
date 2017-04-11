package StrategyMode.strategy;

import StrategyMode.ChargeClass;
/**
 * ¥Ú’€¿‡
 * @author 83771
 *
 */
public class DiscountCharge extends ChargeClass {

	private double rate;
	public DiscountCharge(double rate) {
		this.rate = rate;
	}
	@Override
	public double accept(double money) {
		return money*rate;
	}

}
