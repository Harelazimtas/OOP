
public class A implements EntityCollection {
	private LinkedListA linkedlistA;
	
	public A() {
		this.linkedlistA = new LinkedListA();
	}

	// O(1)
	@Override
	public void add(Entity entity) {
		this.linkedlistA.add(entity);
	}

	// O(n)
	@Override
	public Entity removeMaxValue() {
		return this.linkedlistA.removeEntity();
	}	

}
