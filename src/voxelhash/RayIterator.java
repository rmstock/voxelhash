package voxelhash;
import java.util.Iterator;

public class RayIterator implements Iterator<int[]>{
	private int[] origin;
	private float[] direction;
	private float[] dist;
	private float[] step;
	
	/**
	 * Makes an iterator for the ray object, which iterates in a super-cover
	 * fashion. Each cube the ray intersects is returned, but not if it only
	 * touches an exact corner.
	 * 
	 * @param coord		location where the ray originates, must be in integers.
	 * @param direction	xyz vector of the direction, not its destination.
	 */
	public RayIterator(int[] coord, float[] direction) {
		this.origin = coord;
		this.direction = Vector3.normalize(direction);
		dist = new float[] {
				direction[0] != 0 ? 0 : Float.MAX_VALUE,
				direction[1] != 0 ? 0 : Float.MAX_VALUE,
				direction[2] != 0 ? 0 : Float.MAX_VALUE
		};
		step = new float[]{
				direction[0] != 0 ? Math.abs(1 / direction[0]) : Float.MAX_VALUE,
				direction[1] != 0 ?	Math.abs(1 / direction[1]) : Float.MAX_VALUE,
				direction[2] != 0 ? Math.abs(1 / direction[2]) : Float.MAX_VALUE
		};
	}

	/**
	 * Always return true, as the ray iterates forever.
	 */
	@Override
	public boolean hasNext() {
		return true;
	}

	/**
	 * Always returns a unique location, and exactly adjacent unless it is
	 * determined that the ray has reached an exact intersection.
	 */
	@Override
	public int[] next() {
		int[] ret;
		if(dist[0] < dist[1]) {
			if (dist[0] < dist[2]) {
				ret = new int[] {Math.round(direction[0] * dist[0]) + origin[0], (int)(direction[1] * dist[0]) + origin[1], (int)(direction[2] * dist[0]) + origin[2]};
				dist[0] += step[0];
			} else if (dist[0] > dist[2]) {
				ret = new int[] {(int)(direction[0] * dist[2]) + origin[0], (int)(direction[1] * dist[2]) + origin[1], (int)Math.round(direction[2] * dist[2]) + origin[2]};
				dist[2] += step[2];
			} else {
				ret = new int[] {Math.round(direction[0] * dist[0]) + origin[0], (int)(direction[1] * dist[0]) + origin[1], Math.round(direction[2] * dist[0]) + origin[2]};
				dist[0] += step[0];
				dist[2] += step[2];
			}
		} else if (dist[0] > dist[1]) {
			if (dist[1] < dist[2]) {
				ret = new int[] {(int)(direction[0] * dist[1]) + origin[0], Math.round(direction[1] * dist[1]) + origin[1], (int)(direction[2] * dist[1]) + origin[2]};
				dist[1] += step[1];
			} else if (dist[1] > dist[2]) {
				ret = new int[] {(int)(direction[0] * dist[2]) + origin[0], (int)(direction[1] * dist[2]) + origin[1], Math.round(direction[2] * dist[2]) + origin[2]};
				dist[2] += step[2];
			} else {
				ret = new int[] {(int)(direction[0] * dist[1]) + origin[0], Math.round(direction[1] * dist[1]) + origin[1], Math.round(direction[2] * dist[1]) + origin[2]};
				dist[1] += step[1];
				dist[2] += step[2];
			}
		} else {
			if (dist[0] > dist[2]) {
				ret = new int[] {(int)(direction[0] * dist[0]) + origin[0], (int)(direction[1] * dist[0]) + origin[1], Math.round(direction[2] * dist[0]) + origin[2]};
				dist[2] += step[2];
			} else if (dist[0] < dist[2]) {
				ret = new int[] {Math.round(direction[0] * dist[0]) + origin[0], Math.round(direction[1] * dist[0]) + origin[1], (int)(direction[2] * dist[0]) + origin[2]};
				dist[0] += step[0];
				dist[1] += step[1];
			} else {
				ret = new int[] {Math.round(direction[0] * dist[0]) + origin[0], Math.round(direction[1] * dist[0]) + origin[1], Math.round(direction[2] * dist[0]) + origin[2]};
				dist[0] += step[0];
				dist[2] += step[2];
				dist[1] += step[1];
			}
		}
		return ret;
	}

}
