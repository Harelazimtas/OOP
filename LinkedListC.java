
public class LinkedListC {
	private Node head;

	public LinkedListC() {
		this.head = new Node(null);
	}
	
	// O(n)
	public void add(Entity entity) {
		Node previousNode=head,temp;
		Node newNode=new Node(entity);
		temp=head.getNext();
		while(temp!= null) {
			previousNode=temp;
			if(newNode.getEntity().getValue() > temp.getEntity().getValue()) {
				break;
			}
			temp=temp.getNext();
		}
		newNode.setNext(previousNode.getNext());
		previousNode.setNext(newNode);
	}
	
	// O(1)
	public Entity removeEntity() {
		if(head.getNext()== null)
			return null;
		Entity entity=head.getNext().getEntity();
		head.setNext(head.getNext().getNext());
		return entity;
		
	}
	
	public void print() {
		Node temp=head.getNext();
		while(temp!=null) {
			System.out.println(temp.getEntity().getValue());
			temp=temp.getNext();
		}
	}
	
	
}
