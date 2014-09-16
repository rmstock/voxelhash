package voxelhash;

/* Bounding contains two Vector3s, which is uses to compute the minimum and maximum
 * xyz values. 
 * 
 * */
public class Bounding {
	private int[] max;
	private int[] min;
	
	public Bounding() {
		
	}
	
	public Bounding(int[] min, int[] max) {
		this.max = max;
		this.min = min;
	}
	
	public boolean extend(int[] point) {
		boolean extend = false;
		if (max == null || min == null) {
			max = point;
			min = point;
			extend = true;
		} else {
			for (int i = 0; i < 3; i++) {
				if (max[i] < point[i]) {
					max[i] = point[i];
					extend = true;
				}
				if (min[i] > point[i]) {
					min[i] = point[i];
					extend = true;
				}
			}
		}
		return extend;
	}

	public boolean testHit(Ray incoming) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean testHit(Ray incoming, Float near, Float far) {
		return false;
	}
}
