package d08;

public class Vegetable {
	public String name;
	public int amount;
	public int expDate;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAmount() {
		return amount;

	}

	public void setAmount(int amount) {
		this.amount = amount;

	}

	public int getExpDate() {
		return expDate;

	}

	public void setExpDate(int expDate) {
		this.expDate = expDate;

	}

	@Override
	public String toString() {
		return "Vegetable [이름 = " + name + ", 수량 = " + amount + ", 유통기한 = " + expDate + "]";
	}

}
