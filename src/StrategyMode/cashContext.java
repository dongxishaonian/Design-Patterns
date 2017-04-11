package StrategyMode;

import StrategyMode.strategy.DiscountCharge;
import StrategyMode.strategy.OrdinaryCharge;
import StrategyMode.strategy.RebateCharge;

/**
 * 管理策略context类
 * 简单工厂模式与策略模式共用
 * @author 83771
 *
 */
public class cashContext {

	private ChargeClass cc;

	public ChargeClass getCc() {
		return cc;
	}

	public void setCc(ChargeClass cc) {
		this.cc = cc;
	}

	public cashContext(String mode) {
		switch (mode) {
		case "八折":
			cc = new DiscountCharge(0.8);
			break;
		case "满200返50":
			cc = new RebateCharge(200, 50);
			break;
		default:
			cc = new OrdinaryCharge();
			break;
		}
	}
	
	public double getResult( double money){
		return cc.accept(money);
	}
}
