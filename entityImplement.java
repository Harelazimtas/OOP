
public class entityImplement implements Entity  {
	private int value;
	
	public entityImplement(int value) {
		super();
		this.value = value;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		entityImplement other = (entityImplement) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "entityImplement [value=" + value + "]";
	}
	

}
