
interface Entity
{
	public int getValue();// unique
}

interface EntityCollection
{
	public void add(Entity entity);
	public Entity removeMaxValue();
}