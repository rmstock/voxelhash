
public class Ray {
	private Vector3 origin;
	private Vector3 direction;
	
	public Ray(Vector3 origin, Vector3 direction) {
		this.origin = origin;
		this.direction = direction;
	}
	
	public Vector3 getLocHitX(int x) {
		float xDir = (float)direction.getValue((byte)0) / Integer.MAX_VALUE;
		float yDir = (float)direction.getValue((byte)1) / Integer.MAX_VALUE;
		float zDir = (float)direction.getValue((byte)2) / Integer.MAX_VALUE;
		float scale = ((float)x - (float)origin.getValue((byte) 0)) / xDir;
		int y = origin.getValue((byte)1) + ((int) (yDir * scale + .5));
		int z = origin.getValue((byte)2) + ((int) (zDir * scale + .5));
		int[] xyz = new int[]{x, y, z};
		return new Vector3(xyz);
	}
	public Vector3 getLocHitY(int y) {
		float xDir = (float)direction.getValue((byte)0) / Integer.MAX_VALUE;
		float yDir = (float)direction.getValue((byte)1) / Integer.MAX_VALUE;
		float zDir = (float)direction.getValue((byte)2) / Integer.MAX_VALUE;
		float scale = ((float)y - (float)origin.getValue((byte) 1)) / yDir;
		int x = origin.getValue((byte)0) + ((int) (xDir * scale + .5));
		int z = origin.getValue((byte)2) + ((int) (zDir * scale + .5));
		int[] xyz = new int[]{x, y, z};
		return new Vector3(xyz);
	}
	public Vector3 getLocHitZ(int z) {
		float xDir = (float)direction.getValue((byte)0) / Integer.MAX_VALUE;
		float yDir = (float)direction.getValue((byte)1) / Integer.MAX_VALUE;
		float zDir = (float)direction.getValue((byte)2) / Integer.MAX_VALUE;
		float scale = ((float)z - (float)origin.getValue((byte) 2)) / zDir;
		int x = origin.getValue((byte)0) + ((int) (xDir * scale + .5));
		int y = origin.getValue((byte)1) + ((int) (yDir * scale + .5));
		int[] xyz = new int[]{x, y, z};
		return new Vector3(xyz);
	}

}
