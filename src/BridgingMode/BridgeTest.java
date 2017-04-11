package BridgingMode;

import BridgingMode.MobileBrand.Nokia;
import BridgingMode.Soft.MobileGame;
import BridgingMode.Soft.MobileMovie;

public class BridgeTest {

	public static void main(String[] args) {
		MobileGame game = new MobileGame();
		MobileMovie movie = new MobileMovie();
		
		Nokia nokia = new Nokia();
		nokia.setSoft(game);
		nokia.Run();
		nokia.setSoft(movie);
		nokia.Run();
	}
}
