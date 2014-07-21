
public class Ray {
	private Vector3 origin;
	private Vector3 direction;
	
	public Ray(Vector3 origin, Vector3 direction) {
		this.origin = origin;
		this.direction = direction;
	}
	
	public Vector3 getLocHitX(float x) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (x - origin.getValue(0)) / xDir;
		float y = origin.getValue(1) + yDir * scale;
		float z = origin.getValue(2) + zDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Vector3(xyz);
	}
	public Vector3 getLocHitY(float y) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (y - origin.getValue(1)) / yDir;
		float x = origin.getValue(0) + xDir * scale;
		float z = origin.getValue(2) + zDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Vector3(xyz);
	}
	public Vector3 getLocHitZ(float z) {
		float xDir = direction.getValue(0);
		float yDir = direction.getValue(1);
		float zDir = direction.getValue(2);
		float scale = (z - origin.getValue(2)) / zDir;
		float x = origin.getValue(0) + xDir * scale;
		float y = origin.getValue(1) + yDir * scale;
		float[] xyz = new float[]{x, y, z};
		return new Vector3(xyz);
	}

}
