
public class BaseType {
	private Type myType;
	private Number myValue;
	
	public BaseType(Number value, Type type) {
		myValue = value;
		myType = type;
	}
	
	public Number getNumber() {
		return myValue;
	}
	
	public Type getType() {
		return myType;
	}
	
	public byte byteValue() {
		return myValue.byteValue();
	}
	
	public short shortValue() {
		return myValue.shortValue();
	}
	
	public int intValue() {
		return myValue.intValue();
	}
	
	public long longValue() {
		return myValue.longValue();
	}
	
	public float floatValue() {
		return myValue.floatValue();
	}
	
	public double doubleValue() {
		return myValue.doubleValue();
	}
	
	public BaseType subtract(BaseType second) {
		Number value;
		switch (myType) {
			case BYTE: value = myValue.byteValue() - second.byteValue();
				break;
			case SHORT: value = myValue.shortValue() - second.shortValue();
				break;
			case INT: value = myValue.intValue() - second.intValue();
				break;
			case LONG: value = myValue.longValue() - second.longValue();
				break;
			case FLOAT: value = myValue.floatValue() - second.floatValue();
				break;
			case DOUBLE: value = myValue.doubleValue() - second.doubleValue();
				break;
			default: value = 0;
		}
		return new BaseType(value, myType);
	}
	
	public BaseType add(BaseType second) {
		Number value;
		switch (myType) {
			case BYTE: value = myValue.byteValue() + second.byteValue();
				break;
			case SHORT: value = myValue.shortValue() + second.shortValue();
				break;
			case INT: value = myValue.intValue() + second.intValue();
				break;
			case LONG: value = myValue.longValue() + second.longValue();
				break;
			case FLOAT: value = myValue.floatValue() + second.floatValue();
				break;
			case DOUBLE: value = myValue.doubleValue() + second.doubleValue();
				break;
			default: value = 0;
		}
		return new BaseType(value, myType);
	}
	
	public byte getAccuracy() {
		switch (myType) {
			case BYTE: return 8;
			case SHORT: return 16;
			case INT: return 32;
			case LONG: return 64;
			case FLOAT: return 23;
			case DOUBLE: return 53;
			default: return 0;
		}
	}
}
