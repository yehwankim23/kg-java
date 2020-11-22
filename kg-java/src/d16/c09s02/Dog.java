package d16.c09s02;

public class Dog implements Comparable<Dog> {
	String dogId;
	String dogName;
	int weight;

	@Override
	public int compareTo(Dog o) {
		return this.weight-o.weight;

	}

	public Dog(String dogId, String dogName, int weight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + "] " + this.hashCode();

	}

	public String getDogId() {
		return dogId;

	}

	public void setDogId(String dogId) {
		this.dogId = dogId;

	}

	public String getDogName() {
		return dogName;

	}

	public void setDogName(String dogName) {
		this.dogName = dogName;

	}

	public int getWeight() {
		return weight;

	}

	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dogId == null) ? 0 : dogId.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		result = prime * result + weight;
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
		Dog other = (Dog) obj;
		if (dogId == null) {
			if (other.dogId != null)
				return false;
		} else if (!dogId.equals(other.dogId))
			return false;
		if (dogName == null) {
			if (other.dogName != null)
				return false;
		} else if (!dogName.equals(other.dogName))
			return false;
		if (weight != other.weight)
			return false;
		return true;

	}

}
