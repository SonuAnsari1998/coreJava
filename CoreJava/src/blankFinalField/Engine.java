package blankFinalField;

public class Engine { 
	String type;
	int hoursPower;
	public Engine(String type, int hoursPower) {
		super();
		this.type = type;
		this.hoursPower = hoursPower;
	}
	@Override
	public String toString() {
		return "Engine [" + (type != null ? "type=" + type + ", " : "") + "hoursPower=" + hoursPower + "]";
	}
	
}
