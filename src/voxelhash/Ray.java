package voxelhash;
import java.util.Iterator;


public class Ray implements Iterable<int[]>{
	private int[] origin;
	private float[] direction;
	
	public Ray(int[] origin, float[] direction) {
		this.origin = origin;
		this.direction = direction;
	}
	
	public int[] getLocHitX(float x) {
		float xDir = direction[0];
		float yDir = direction[1];
		float zDir = direction[2];
		float scale = (x - origin[0]) / xDir;
		int y = origin[1] + (int) (yDir * scale);
		int z = origin[2] + (int) (zDir * scale);
		return new int[]{(int)x, y, z};
	}
	
	public int[] getLocHitY(float y) {
		float xDir = direction[0];
		float yDir = direction[1];
		float zDir = direction[2];
		float scale = (y - origin[0]) / yDir;
		int x = origin[0] + (int) (xDir * scale);
		int z = origin[2] + (int) (zDir * scale);
		return new int[]{x, (int)y, z};
	}
	
	public int[] getLocHitZ(float z) {
		float xDir = direction[0];
		float yDir = direction[1];
		float zDir = direction[2];
		float scale = (z - origin[0]) / zDir;
		int x = origin[0] + (int) (xDir * scale);
		int y = origin[1] + (int) (yDir * scale);
		return new int[]{x, y, (int)z};
	}

	public Iterator<int[]> iterator() {
		return new RayIterator(origin, direction);
	}

}
