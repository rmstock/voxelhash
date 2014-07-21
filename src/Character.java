import java.util.Map;

public class Character implements IRenderable {
	public Character() {
		
	}

	@Override
	public Map<Coord, IVoxel> getVoxelMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coord getOffset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean boundingHit(Ray incoming) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isImmutable() {
		// TODO Auto-generated method stub
		return false;
	}
}