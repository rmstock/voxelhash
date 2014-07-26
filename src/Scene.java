import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Scene implements IRenderable{
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

	@Override
	public Map<Coordinate, IVoxel> getVoxelMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coordinate getOffset() {
		return Coordinate.getZero();
	}

	@Override
	public boolean boundingHit(Ray incoming) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return true;
	}
}