import java.util.ArrayList;
import java.util.List;

public class Coord{
	private byte dim;
	private List<BaseType> vals;
	private Type myType;
	
	public Coord(byte dim, List<BaseType> vals) {
		this.vals = vals;
		this.dim = dim;
	}
	
	public byte getDimensions() {
		return dim;
	}
	
	public Coord getDifference(Coord second, boolean aMinB) {
		
		if (dim != second.getDimensions()) {
			System.out.println("Dimension exception");
			return null;
		}
		List<BaseType> ret = new ArrayList<BaseType>(dim);
		if (aMinB) {
			for (int i = 0; i < dim; i++) {
				BaseType saver = vals.get(i).subtract(second.vals.get(i));
				if (!aMinB) {
					Number temp = 0;
					BaseType zero = new BaseType(temp, myType);
					saver = zero.subtract(saver);
				}
				ret.set(i,saver);
			}
		}
		return new Coord(dim, ret);
	}
	
	public byte getAccuracy() {
		return vals.get(1).getAccuracy();
	}
	
	public BaseType getValue(byte i) {
		return vals.get(1);
	}
}
