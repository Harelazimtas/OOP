
public class Node {
	private Node next;
	private Entity entity;

	public Node(Entity entity) {
		this.next = null;
		this.entity = entity;
	}

	// getter and setter
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Entity getEntity() {
		return this.entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
