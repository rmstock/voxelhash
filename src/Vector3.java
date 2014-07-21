public class Vector3{
	private static byte dim = 3;
	private float[] vals;
	
	public Vector3(float[] vals) {
		this.vals = vals;
	}
	
	public Vector3 subtract(Vector3 second) {
		float[] data = new float[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] - second.vals[i];
		}
		return new Vector3(data);
	}
	
	public Vector3 add(Vector3 second) {
		
		float[] data = new float[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] + second.vals[i];
		}
		return new Vector3(data);
	}
	
	public float getValue(int i) {
		return vals[i];
	}

	public void setValue(int i, float value) {
		vals[i] = value;
	}
	
	public void roundToInt() {
		for (int i = 0; i < 3; i++) {
			vals[i] = Math.round(vals[i]);
		}
	}
	
	public static Vector3 getZero() {
		float[] zero = new float[] {0,0,0};
		return new Vector3(zero);
	}
}
