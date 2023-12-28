package School;

public class Chaitanya implements tsschool {
	private double fee;
	private String add;

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public void name() {
		System.out.println("this is chaitanya school");
	}

}
