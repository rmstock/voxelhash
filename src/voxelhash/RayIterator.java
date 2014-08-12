package voxelhash;
import java.util.Iterator;

public class RayIterator implements Iterator<int[]>{
	private int[] origin;
	private float[] direction;
	private float[] dist;
	private float[] step;
	private int[] last;
	
	
	public RayIterator(int[] coord, float[] direction) {
		this.origin = coord;
		this.direction = direction;
		dist = new float[]{0,0,0};
		Vector3.normalize(dist);
		step = new float[]{1 / direction[0], 1 / direction[1], 1 / direction[2]};
		last = null;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public int[] next() {
		int shortest;
		shortest = (dist[0] > dist[1]) ? 1 : 0;
		shortest = (dist[shortest] > dist[2]) ? 2 : shortest;
		int[] ret = new int[]{(int)(direction[0] * dist[shortest]) + origin[0], (int)(direction[1] * dist[shortest]) + origin[1], (int)(direction[2] * dist[shortest]) + origin[2]};
		dist[shortest] = dist[shortest] + step[shortest];
		if (origin.equals(last))
			System.out.println("Error: Origin" + origin.toString() + " equals next: " + ret.toString());
		return ret;
	}

}
