package sheepdog.tdl.main;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import sheepdog.gop.main.GameWindow;
import sheepdog.gop.main.SpriteSheet;
import sheepdog.tdl.gameloop.GameLoop;
public class Main {

	public static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static int width= gd.getDisplayMode().getWidth();
	public static int height = gd.getDisplayMode().getHeight();
	
	static SpriteSheet blocks = new SpriteSheet();
	public static void main(String[] args) {
		GameWindow frame = new GameWindow("TheDLooter", width, height);
		frame.setFullscreen(1);
		frame.add(new GameLoop(width, height));
		frame.setVisible(true);
		
		
	}

}
