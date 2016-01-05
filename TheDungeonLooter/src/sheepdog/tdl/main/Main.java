package sheepdog.tdl.main;
import sheepdog.gop.main.GameWindow;
import sheepdog.gop.main.SpriteSheet;
public class Main {

	static SpriteSheet blocks = new SpriteSheet();
	public static void main(String[] args) {
		GameWindow frame = new GameWindow("TheDLooter", 1280, 720);
		frame.setFullscreen(1);
		frame.setVisible(true);
		
		
	}

}
