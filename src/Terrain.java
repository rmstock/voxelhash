import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Terrain implements IRenderable {
	Map<Coordinate, IVoxel> map = new HashMap<Coordinate, IVoxel>();
	Bounding box = new Bounding();
	
	public Terrain() {
		
	}

	public Map<Coordinate, IVoxel> getVoxelMap() {
		return map;
	}

	public Coordinate getOffset() {
		return Coordinate.getZero();
	}

	public boolean boundingHit(Ray incoming) {
		return box.testHit(incoming);
	}
	
	public boolean addVoxels(Map<Coordinate, IVoxel> map, Coordinate offset) {
		boolean clean = true;
		Set<Entry<Coordinate, IVoxel>> set = map.entrySet();
		for (Entry<Coordinate, IVoxel> e : set) {
			Coordinate loc = e.getKey();
			IVoxel vox = e.getValue();
			loc = loc.add(offset);
			vox = map.put(loc, vox);
			box.extend(loc);
			if (vox != null)
				clean = false;
		}
		return clean;
	}

	@Override
	public boolean isImmutable() {
		return true;
	}
}