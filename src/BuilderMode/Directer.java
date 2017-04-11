package BuilderMode;
/**
 * 建造者模式指挥类
 * @author jeker_chen
 */
public class Directer {

	public void build(Builder builder){
		builder.builderPart1();
		builder.builderPart2();
	}
	
}
