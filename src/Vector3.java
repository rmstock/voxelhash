public class Vector3{
	//TODO convert to use ICoord, Number is too slow.
	private static byte dim = 3;
	private int[] vals;
	
	public Vector3(int[] vals) {
		this.vals = vals;
	}
	
	public Vector3 subtract(Vector3 second) {
		int[] data = new int[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] - second.vals[i];
		}
		return new Vector3(data);
	}
	
	public Vector3 add(Vector3 second) {
		
		int[] data = new int[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] + second.vals[i];
		}
		return new Vector3(data);
	}
	
	public int getValue(byte i) {
		return vals[i];
	}

	public void setValue(byte i, int value) {
		vals[i] = value;
	}
}
