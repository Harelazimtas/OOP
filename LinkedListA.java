
public class LinkedListA {
	private Node head;

	public LinkedListA() {
		this.head = new Node(null);
	}

	// O(1)
	public void add(Entity entity) {
		Node newNode = new Node(entity);
		newNode.setNext(head.getNext());
		head.setNext(newNode);
	}

	// O(n)
	public Entity removeEntity() {
		int MaxValue = Integer.MIN_VALUE;
		Node nodeprevious = null, temp;
		Entity entity;
		if (head.getNext() == null)
			return null;
		temp = this.head;
		while (temp.getNext() != null) {
			if (temp.getNext().getEntity().getValue() > MaxValue) {
				MaxValue = temp.getNext().getEntity().getValue();
				// save the previous node of node that have max value
				nodeprevious = temp;
			}
			temp = temp.getNext();
		}
		entity = nodeprevious.getNext().getEntity();
		nodeprevious.setNext(nodeprevious.getNext().getNext());
		return entity;
	}

	public void print() {
		Node temp = head.getNext();
		while (temp != null) {
			System.out.println(temp.getEntity().getValue());
			temp = temp.getNext();
		}
	}

}
