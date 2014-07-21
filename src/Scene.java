import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Scene {
	Set<IRenderable> renderables;
	Map<Coord, IVoxel> baseMap;
	
	public Scene() {
		renderables = new HashSet<IRenderable>();
		baseMap = new HashMap<Coord, IVoxel>();
	}
	
	public boolean add(IRenderable toAdd) {
		if (toAdd.isImmutable()) {
			Map<Coord, IVoxel> smallMap = toAdd.getVoxelMap();
			baseMap.putAll(smallMap);
			return true;
		}
		else {
			return renderables.add(toAdd);
		}
	}
	
	public boolean remove(IRenderable toRemove) {
		return renderables.remove(toRemove);
	}
}