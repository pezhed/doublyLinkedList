package doublyLinked;

public class Link {
	public int data;
	public Link next;
	public Link previous;
	
	public Link(int d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + "  ");
	}
	
	public int getData() {
		return data;
	}
}
