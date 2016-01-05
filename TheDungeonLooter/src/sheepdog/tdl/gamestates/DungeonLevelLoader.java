package sheepdog.tdl.gamestates;

import java.awt.Graphics2D;

import sheepdog.gop.main.SpriteSheet;
import sheepdog.tdl.gamestate.GameState;
import sheepdog.tdl.gamestate.GameStateManager;

public class DungeonLevelLoader extends GameState {

	SpriteSheet test = new SpriteSheet();
	public DungeonLevelLoader(GameStateManager gsm) {
		super(gsm);
		
	}

	@Override
	public void tick(double deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		test.setSpriteSheet(LoadImage.)
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("hello world", 200	, 200);
		
	}

}
