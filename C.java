
public class C implements EntityCollection {
	private LinkedListC LinkedListC;

	public C() {
		LinkedListC = new LinkedListC();
	}

	// O(n)
	@Override
	public void add(Entity entity) {
		LinkedListC.add(entity);

	}
	// O(1)
	@Override
	public Entity removeMaxValue() {
		return LinkedListC.removeEntity();
	}

	public LinkedListC getLinkedListC() {
		return LinkedListC;
	}

}
