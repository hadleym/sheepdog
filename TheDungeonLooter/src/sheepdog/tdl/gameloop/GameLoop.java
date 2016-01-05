package sheepdog.tdl.gameloop;

import java.awt.Component;

import sheepdog.gop.main.SDGameLoop;
import sheepdog.tdl.gamestate.GameStateManager;

public class GameLoop extends SDGameLoop {

	GameStateManager gsm;
	
	public GameLoop(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void init() {
		
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
