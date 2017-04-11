package StrategyMode;

public class cashContext01 {

	private ChargeClass cc ;
	public cashContext01(ChargeClass cc) {
		this.cc = cc;
	}
	public double  gainmoney(double money){
		return cc.accept(money);
	}
}
