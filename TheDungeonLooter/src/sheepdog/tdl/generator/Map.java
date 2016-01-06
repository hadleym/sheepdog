package sheepdog.tdl.generator;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import sheepdog.gop.main.LoadImage;
import sheepdog.gop.main.Vector2F;
import sheepdog.tdl.main.Main;

public class Map {
	TileManager tiles = new TileManager();
	private BufferedImage map;
	public Map(){
		
	}
	
	public void init(){
		
		try {
			
		
			map = LoadImage.LoadImageFrom(Main.class, "map.png");
		} catch (Exception e) {
			
		}
		for (int x = 0; x < 100; x++){
			for (int y = 0; y < 100; y++){
				int col = map.getRGB(x,y);
				col = (col & 0xFFFFFF);
				switch(col){
				case 0x777777:
					tiles.blocks.add(new Block(new Vector2F(x*32,y*32)));
					break;
				}
			}
		}
		
	}
	
	public void tick(double deltaTime){
		tiles.tick(deltaTime);
		
	}

	public void render(Graphics2D g){
		tiles.render(g);
		
	}
	
}
