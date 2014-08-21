package voxelhash;

public class Vector3{
	
	private Vector3() {
	}

	public static float[] makeFloats(int[] vals) {
		return new float[] {(float) vals[0], (float) vals[1], (float) vals[2]};
	}
	
	public static int[] makeInts(float[] vals) {
		return new int[] {(int) vals[0], (int) vals[1], (int) vals[2]};
	}
	
	public static float[] subtract(float[] first, float[] second) {
		float[] data = new float[3];
		for (int i = 0; i < 3; i++) {
			data[i] = first[i] - second[i];
		}
		return data;
	}
	
	public static int[] subtract(int[] first, int[] second) {
		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = first[i] - second[i];
		}
		return data;
	}
	
	public static float[] add(float[] first, float[] second) {
		float[] data = new float[3];
		for (int i = 0; i < 3; i++) {
			data[i] = first[i] + second[i];
		}
		return data;
	}
	
	public static int[] add(int[] first, int[] second) {
		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = first[i] + second[i];
		}
		return data;
	}
	
	public static float[] normalize(float[] vals) {
		float length = (float)Math.sqrt(Math.pow(vals[0],2) + Math.pow(vals[1],2) + Math.pow(vals[2],2));
		return new float[] {vals[0] /= length, vals[1] /= length, vals[2] /= length};
	}
}
