public class Vector3{
	//TODO convert to use ICoord, Number is too slow.
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
}
