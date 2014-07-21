import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Scene {
	Set<IRenderable> renderables;
	Terrain baseMap;
	
	public Scene() {
		renderables = new HashSet<IRenderable>();
		baseMap = new Terrain();
	}
	
	public boolean add(IRenderable toAdd) {
		if (toAdd.isImmutable()) {
			return baseMap.addVoxels(toAdd.getVoxelMap(), toAdd.getOffset());
		}
		else {
			return renderables.add(toAdd);
		}
	}
	
	public boolean remove(IRenderable toRemove) {
		return renderables.remove(toRemove);
	}
}