package doublyLinked;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList theList = new DoublyLinkedList();
		
		theList.insertFirst(12);
		theList.insertFirst(22);
		
		theList.displayForward();
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.displayForward();
		
		if(!theList.isEmpty()) {
			theList.insertAfter(22, 90);
		}else 
			theList.insertFirst(90);
		
		theList.insertFirst(60);
		theList.insertFirst(70);
		theList.insertFirst(80);	
		theList.insertFirst(100);
		
		theList.insertLast(40);
		
		theList.displayForward();
	}

}
