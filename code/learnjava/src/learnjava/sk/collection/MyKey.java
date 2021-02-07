package learnjava.sk.collection;

public class MyKey {

	public String first;
	public String second;
	
	public MyKey() {
		
	}
	
	public MyKey(String first, String second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "MyKey [first=" + first + ", second=" + second + "]";
	}
}

