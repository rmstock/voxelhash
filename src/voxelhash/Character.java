package voxelhash;
import java.util.HashMap;
import java.util.Map;

public class Character implements IRenderable {
	private Bounding box;
	private Map<int[], IVoxel> map;
	private int[] offset;
	private boolean immutable;
	
	public Character() {
		// TODO set initializers and fill bounding from map from file
		box = new Bounding();
		map = new HashMap<int[], IVoxel>();
		offset = new int[] {0,0,0};
		immutable = false;
	}

	@Override
	public Map<int[], IVoxel> getVoxelMap() {
		return map;
	}

	@Override
	public int[] getOffset() {
		return offset;
	}

	@Override
	public boolean boundingHit(Ray incoming) {
		return box.testHit(incoming);
	}

	@Override
	public boolean isImmutable() {
		return immutable;
	}

	@Override
	public boolean collision(Ray incoming, byte[] colorRet) {
		// TODO Auto-generated method stub
		return false;
	}
}