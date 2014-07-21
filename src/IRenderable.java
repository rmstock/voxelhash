import java.util.Map;

public interface IRenderable {
	public Map<Coord, IVoxel> getVoxelMap();
	public Coord getOffset();
	public boolean boundingHit(Ray incoming);
	public boolean isImmutable();
}
