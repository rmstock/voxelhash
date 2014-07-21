import java.util.HashMap;
import java.util.Map;

public class Character implements IRenderable {
	private Bounding box;
	private Map<Vector3, IVoxel> map;
	private Vector3 offset;
	private boolean immutable;
	
	public Character() {
		box = new Bounding();
		map = new HashMap<Vector3, IVoxel>();
		offset = Vector3.getZero();
		immutable = false;
	}

	@Override
	public Map<Vector3, IVoxel> getVoxelMap() {
		return map;
	}

	@Override
	public Vector3 getOffset() {
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
}