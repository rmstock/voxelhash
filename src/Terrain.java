import java.util.Map;

public class Terrain implements IRenderable {
	public Terrain() {
		
	}

	public Map<Vector3, IVoxel> getVoxelMap() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vector3 getOffset() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean boundingHit(Ray incoming) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean addVoxels(Map<Vector3, IVoxel> map, Vector3 offset) {
		// TODO fill
		return false;
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}
}