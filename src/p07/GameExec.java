package p07;

public class GameExec {
	
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}

	public static void main(String[] args) {
		MapleStory ms=new MapleStory();
		ms.name="메이플스토리";
		
		CartRider cr=new CartRider();
		cr.name="카트라이더";
		
		runGame(ms);
		runGame(cr);

	}

}
