import java.util.Iterator;


public class Ray implements Iterable<Coordinate>{
	private Coordinate origin;
	private Vector3 direction;
	
	public Ray(Coordinate origin, Vector3 direction) {
		this.origin = origin;
		this.direction = direction;
	}
	
	public Coordinate getLocHitX(float x) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (x - origin.getValue(0)) / xDir;
		float y = origin.getValue(1) + yDir * scale;
		float z = origin.getValue(2) + zDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Coordinate(xyz);
	}
	public Coordinate getLocHitY(float y) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (y - origin.getValue(1)) / yDir;
		float x = origin.getValue(0) + xDir * scale;
		float z = origin.getValue(2) + zDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Coordinate(xyz);
	}
	public Coordinate getLocHitZ(float z) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (z - origin.getValue(2)) / zDir;
		float x = origin.getValue(0) + xDir * scale;
		float y = origin.getValue(1) + yDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Coordinate(xyz);
	}

	public Iterator<Coordinate> iterator() {
		return new RayIterator(origin, direction);
	}

}
