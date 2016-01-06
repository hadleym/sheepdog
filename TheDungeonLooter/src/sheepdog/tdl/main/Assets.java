package sheepdog.tdl.main;

import java.awt.image.BufferedImage;

import sheepdog.gop.main.LoadImage;
import sheepdog.gop.main.SpriteSheet;

public class Assets {
	SpriteSheet blocks = new SpriteSheet();
	private BufferedImage stone_1;
	
	public void init(){
		blocks.setSpriteSheet(LoadImage.LoadImageFrom(Main.class, "spritesheet.png"));
		stone_1 = blocks.getTile(0,0,16,16);
	}
}
