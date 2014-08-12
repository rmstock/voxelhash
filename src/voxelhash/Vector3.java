package voxelhash;
import java.util.Arrays;

public class Vector3{
	private static byte dim = 3;
	private float[] vals;
	
	public Vector3(float[] vals) {
		this.vals = vals;
	}
	
	public Vector3(int[] vals) {
		this.vals = new float[3];
		this.vals[0] = (float)vals[0];
		this.vals[1] = (float)vals[1];
		this.vals[2] = (float)vals[2];
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
	
	public static void normalize(float[] vals) {
		float length = (float)Math.sqrt(Math.pow(vals[0],2) + Math.pow(vals[1],2) + Math.pow(vals[2],2));
		vals[0] /= length;
		vals[1] /= length;
		vals[2] /= length;
	}
	
	public static Vector3 getZero() {
		float[] zero = new float[] {0,0,0};
		return new Vector3(zero);
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(vals);
	}
	
	@Override
	public boolean equals(Object second) {
		if (second instanceof Vector3) {
			Vector3 two = (Vector3) second;
			if (two.vals[0] == vals[0] && two.vals[1] == vals[1] && two.vals[2] == vals[2])
				return true;
		}
		return false;
	}
}
