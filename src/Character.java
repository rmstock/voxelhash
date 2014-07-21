import java.util.Map;

public class Character implements IRenderable {
	private Bounding box;
	
	public Character() {
		
	}

	@Override
	public Map<Vector3, IVoxel> getVoxelMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector3 getOffset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean boundingHit(Ray incoming) {
		return box.testHit(incoming);
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}
}