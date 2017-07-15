package testPackage;
import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Model;
import renderEngine.Render;
import renderEngine.VertexDataLoader;
public class MainGameLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayManager.createDisplay();
		
		VertexDataLoader loader = new VertexDataLoader();
		Render render = new Render();
		
		float[] vertices = {
			-0.5f, 0.5f, 0f,
			-0.5f, -0.5f, 0f,
			0.5f, -0.5f, 0f,
			0.5f, -0.5f, 0f,
			0.5f, 0.5f, 0f,
			-0.5f, 0.5f, 0f	
		};
		
		Model model = loader.loadToVAO(vertices);
		//game loop
		while(!Display.isCloseRequested()) {
			render.prepare();
			render.render(model);
			
			
			DisplayManager.updateDisplay();
		}
		
		loader.cleanUp();
		DisplayManager.closeDisplay();
	}

}
