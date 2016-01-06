package sheepdog.tdl.gamestates;

import java.awt.Graphics2D;

import sheepdog.gop.main.LoadImage;
import sheepdog.gop.main.SpriteSheet;
import sheepdog.tdl.gamestate.GameState;
import sheepdog.tdl.gamestate.GameStateManager;
import sheepdog.tdl.generator.Map;
import sheepdog.tdl.main.Main;

public class DungeonLevelLoader extends GameState {

	Map map;
	
	public DungeonLevelLoader(GameStateManager gsm) {
		super(gsm);
		
	}

	@Override
	public void tick(double deltaTime) {
		map.tick(deltaTime);
		
	}

	@Override
	public void init() {
		map = new Map();
		map.init();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("hello world", 200	, 200);
		map.render(g);
		
	}

}
