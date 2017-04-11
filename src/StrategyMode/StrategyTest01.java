package StrategyMode;

import StrategyMode.strategy.DiscountCharge;

public class StrategyTest01 {
	public static void main(String[] args) {
		cashContext01 cc1 ;
		String str= "АЫел";
		switch (str) {
		case "АЫел":
			cc1  = new cashContext01(new DiscountCharge(0.8));
			System.out.println(cc1.gainmoney(100));
			break;

		default:
			break;
		}
	}
}
