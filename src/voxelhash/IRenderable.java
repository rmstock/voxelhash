package voxelhash;
import java.util.Map;

public interface IRenderable {
	public Map<Coordinate, IVoxel> getVoxelMap();
	public Coordinate getOffset();
	public boolean boundingHit(Ray incoming);
	public boolean isImmutable();
}
