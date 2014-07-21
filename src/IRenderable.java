import java.util.Map;

public interface IRenderable {
	public Map<Vector3, IVoxel> getVoxelMap();
	public Vector3 getOffset();
	public boolean boundingHit(Ray incoming);
	public boolean isImmutable();
}
