import java.util.HashMap;
import java.util.Map;

public class Character implements IRenderable {
	private Bounding box;
	private Map<Coordinate, IVoxel> map;
	private Coordinate offset;
	private boolean immutable;
	
	public Character() {
		box = new Bounding();
		map = new HashMap<Coordinate, IVoxel>();
		offset = Coordinate.getZero();
		immutable = false;
	}

	@Override
	public Map<Coordinate, IVoxel> getVoxelMap() {
		return map;
	}

	@Override
	public Coordinate getOffset() {
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