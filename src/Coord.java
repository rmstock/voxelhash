public class Coord{
	//TODO convert to use ICoord, Number is too slow.
	private byte dim;
	private BaseType[] vals;
	private Type myType;
	
	public Coord(byte dim, BaseType[] vals) {
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
		BaseType[] ret = new BaseType[dim];
		if (aMinB) {
			for (int i = 0; i < dim; i++) {
				BaseType saver = vals[i].subtract(second.vals[i]);
				if (!aMinB) {
					Number temp = 0;
					BaseType zero = new BaseType(temp, myType);
					saver = zero.subtract(saver);
				}
				ret[i] = saver;
			}
		}
		return new Coord(dim, ret);
	}
	
	public byte getAccuracy() {
		return vals[1].getAccuracy();
	}
	
	public BaseType getValue(byte i) {
		return vals[i];
	}
}
