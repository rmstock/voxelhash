package voxelhash;
import java.util.Map;

public interface IRenderable {
	public Map<int[], IVoxel> getVoxelMap();
	public int[] getOffset();
	public boolean boundingHit(Ray incoming);
	public boolean isImmutable();
}
