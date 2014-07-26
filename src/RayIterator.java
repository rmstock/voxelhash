import java.util.Iterator;


public class RayIterator implements Iterator<Coordinate>{
	private Coordinate origin;
	private Vector3 direction;
	private Vector3 dist;
	private Vector3 step;
	private Coordinate last;
	
	
	public RayIterator(Coordinate origin, Vector3 direction) {
		this.origin = origin;
		this.direction = direction;
		dist = Vector3.getZero();
		this.direction.normalize();
		step = new Vector3(new float[]{1 / direction.getValue(0), 1 / direction.getValue(1), 1 / direction.getValue(2)});
		last = null;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Coordinate next() {
		int shortest;
		shortest = (dist.getValue(0) > dist.getValue(1)) ? 1 : 0;
		shortest = (dist.getValue(shortest) > dist.getValue(2)) ? 2 : shortest;
		Coordinate ret = new Coordinate(new int[]{(int)(direction.getValue(0) * dist.getValue(shortest)), (int)(direction.getValue(1) * dist.getValue(shortest)), (int)(direction.getValue(2) * dist.getValue(shortest))});
		ret.add(origin);
		dist.setValue(shortest, dist.getValue(shortest) + step.getValue(shortest));
		if (origin.equals(last))
			System.out.println("Error: Origin" + origin.toString() + " equals next: " + ret.toString());
		return null;
	}

}
