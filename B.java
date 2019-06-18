import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B implements EntityCollection {
	private Queue<Entity> queue;

	public B() {
		Comparator<Entity> ComparatorForQueue = (a, b) -> {
			return b.getValue() - a.getValue();
		};
		// PriorityQueue like max heap
		queue = new PriorityQueue<>(ComparatorForQueue);
	}

	// O( log(n) )
	@Override
	public void add(Entity entity) {
		this.queue.add(entity);

	}

	// O( log(n) )
	@Override
	public Entity removeMaxValue() {
		return this.queue.remove();
	}

	public Queue<Entity> getQueue() {
		return queue;
	}

}
