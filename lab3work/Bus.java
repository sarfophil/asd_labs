package lab3work;

public class Bus implements Cabinet{
	public double netPrice() {
		return 5.00;
	}

	public double discountPrice() {
		return 1.00;
	}

	public double computePrice() {
		return netPrice();
	}
}
