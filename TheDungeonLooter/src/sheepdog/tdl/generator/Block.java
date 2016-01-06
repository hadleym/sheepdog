package sheepdog.tdl.generator;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import sheepdog.gop.main.Vector2F;

public class Block extends Rectangle {
	Vector2F pos = new Vector2F();
	private int blockSize = 32;
	public Block(Vector2F pos){
		this.pos = pos;
	}
	public void init(){
		
	}
	public void tick(double deltaTime){
		
	}
	public void render(Graphics2D g){
		g.drawRect((int)pos.getWorldLocation().xpos, (int)pos.getWorldLocation().ypos, blockSize, blockSize);
	}
	
	public enum  BlockType{
		STONE_1
	}
}
