import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Terrain implements IRenderable {
	Map<Vector3, IVoxel> map = new HashMap<Vector3, IVoxel>();
	Bounding box = new Bounding();
	
	public Terrain() {
		
	}

	public Map<Vector3, IVoxel> getVoxelMap() {
		return map;
	}

	public Vector3 getOffset() {
		int[] array = new int[] {0,0,0};
		return new Vector3(array);
	}

	public boolean boundingHit(Ray incoming) {
		return box.testHit(incoming);
	}
	
	public boolean addVoxels(Map<Vector3, IVoxel> map, Vector3 offset) {
		boolean clean = true;
		Set<Entry<Vector3, IVoxel>> set = map.entrySet();
		for (Entry<Vector3, IVoxel> e : set) {
			Vector3 loc = e.getKey();
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