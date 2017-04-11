package StrategyMode.strategy;

import StrategyMode.ChargeClass;

public class OrdinaryCharge extends ChargeClass {

	@Override
	public double accept(double money) {
		return money;
	}

}
