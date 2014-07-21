import java.util.HashSet;
import java.util.Set;

public class Scene {
	Set<IRenderable> renderables;
	public Scene() {
		renderables = new HashSet<IRenderable>();
	}
	
	public boolean add(IRenderable toAdd) {
		return renderables.add(toAdd);
	}
	
	public boolean remove(IRenderable toRemove) {
		return renderables.remove(toRemove);
	}
}