/* Bounding contains two Vector3s, which is uses to compute the minimum and maximum
 * xyz values. 
 * 
 * */
public class Bounding {
	private Vector3 max;
	private Vector3 min;
	
	private Bounding(Vector3 max, Vector3 min) {
		this.max = max;
		this.min = min;
	}
	
	private boolean extend(Vector3 point) {
		boolean extend = false;
		if (max == null || min == null) {
			max = point;
			min = point;
			extend = true;
		} else {
			for (int i = 0; i < 3; i++) {
				if (max.getValue((byte)i) < point.getValue((byte)i)) {
					max.setValue((byte) i, point.getValue((byte)i));
					extend = true;
				}
				if (min.getValue((byte) i) > point.getValue((byte) i)) {
					min.setValue((byte) i, point.getValue((byte) i));
					extend = true;
				}
			}
		}
		return extend;
	}
}
