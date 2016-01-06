package sheepdog.tdl.gameloop;

import java.awt.Component;

import sheepdog.gop.main.SDGameLoop;
import sheepdog.gop.main.Vector2F;
import sheepdog.tdl.gamestate.GameStateManager;
import sheepdog.tdl.main.Assets;

public class GameLoop extends SDGameLoop {

	GameStateManager gsm;
	public static Assets assets = new Assets();
	public static float xOffset;
	public static float yOffset;
	
	public GameLoop(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void init() {
		assets.init();
		Vector2F.setWorldVariables(xOffset, yOffset);
		
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	
	@Override
	public void clear() {
		super.clear();
	}
	
	@Override
	public void render() {
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	
	@Override
	public void tick(double deltaTime) {
		gsm.tick(deltaTime);
	}
	
}
