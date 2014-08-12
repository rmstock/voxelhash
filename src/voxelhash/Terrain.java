package voxelhash;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Terrain implements IRenderable {
	Map<int[], IVoxel> map = new HashMap<int[], IVoxel>();
	Bounding box = new Bounding();
	
	public Terrain() {
		
	}

	public Map<int[], IVoxel> getVoxelMap() {
		return map;
	}

	public int[] getOffset() {
		return new int[] {0,0,0};
	}

	public boolean boundingHit(Ray incoming) {
		return box.testHit(incoming);
	}
	
	public boolean addVoxels(Map<int[], IVoxel> map, int[] offset) {
		boolean clean = true;
		Set<Entry<int[], IVoxel>> set = map.entrySet();
		for (Entry<int[], IVoxel> e : set) {
			int[] loc = e.getKey();
			IVoxel vox = e.getValue();
			loc[0] += offset[0];
			loc[1] += offset[1];
			loc[2] += offset[2];
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