package lab3work;

public class Drive implements Cabinet{
	public double netPrice() {
		return 10.00;
	}

	public double discountPrice() {
		return 4.00;
	}

	@Override
	public double computePrice() {
		return discountPrice();
	}
}
