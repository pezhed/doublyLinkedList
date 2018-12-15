package doublyLinked;

public class DoublyLinkedList {

	private Link first;
	private Link last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(int d){
		Link newLink = new Link(d);
		
		if(isEmpty())
			last = newLink;
		else 
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}
	
	//insertlast
	public void insertLast(int d) {
		Link newLink = new Link(d);
		if(isEmpty())
			first = newLink;
		else {			
			last.next = newLink;
			newLink.previous =last;
		}
		last = newLink;
		
	}
	
	//insertafter
	public boolean insertAfter(int key, int dd) {
		Link current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null)
				return false;
		}
		
		Link newLink = new Link(dd);
		if(current == last) {
			newLink.next = null;
			last = newLink;
		}
		else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		current.next = newLink;
		newLink.previous = current;
		return true;
	}
	//deletefirst 
	public Link deleteFirst() {
		Link temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	//deletelast
	public Link deleteLast() {
		Link temp = last;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
	
	//deleteKey()
	public Link deleteKey(int key) {
		Link current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null)
				return null;
		}
		if(current == first)
			first = current.next;
		else
			current.previous.next = current.next;
			
		if(current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		
		return current;
	}
	
	public boolean isEmpty() {
		return(first==null);
	}
	
	
	public void displayForward() {
		
		System.out.print("List (first -> last): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.print(" ");
	}
	
	public void displayBackward() {
		System.out.print("List (Last -> First): ");
		Link current = last;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.print(" ");
	}
}
