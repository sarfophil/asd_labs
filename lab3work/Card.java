package lab3work;

public class Card implements Cabinet{
	public double netPrice() {
		return 10.00;
	}

	public double discountPrice() {
		return 1.00;
	}
	
	@Override
	public double computePrice() {
		return netPrice();
	}
}
