package prototype;

public class Prototype implements Cloneable {
	
	public Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prototype;
	}
}
