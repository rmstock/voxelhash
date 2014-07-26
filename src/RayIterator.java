import java.util.Iterator;


public class RayIterator implements Iterator<Coordinate>{
	private Coordinate origin;
	private Vector3 direction;
	
	
	public RayIterator(Coordinate origin, Vector3 direction) {
		this.origin = origin;
		this.direction = direction;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Coordinate next() {
		// TODO Auto-generated method stub
		return null;
	}

}
