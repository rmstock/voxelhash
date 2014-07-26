public class Coordinate{
	private static byte dim = 3;
	private int[] vals;
	
	public Coordinate(int[] vals) {
		this.vals = vals;
	}
	
	public Coordinate(float[] vals) {
		this.vals = new int[3];
		this.vals[0] = (int)vals[0];
		this.vals[1] = (int)vals[1];
		this.vals[2] = (int)vals[2];
	}
	
	public Coordinate subtract(Coordinate second) {
		int[] data = new int[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] - second.vals[i];
		}
		return new Coordinate(data);
	}
	
	public Coordinate add(Coordinate second) {
		int[] data = new int[3];
		for (int i = 0; i < dim; i++) {
			data[i] = vals[i] + second.vals[i];
		}
		return new Coordinate(data);
	}
	
	public int getValue(int i) {
		return vals[i];
	}

	public void setValue(int i, int value) {
		vals[i] = value;
	}
	
	public static Coordinate getZero() {
		int[] zero = new int[] {0,0,0};
		return new Coordinate(zero);
	}
}
