package lab3work;



public class Board implements Cabinet{

	public double netPrice() {
		return 26.00;
	}

	public double discountPrice() {
		return 6.00;
	}

	@Override
	public double computePrice() {
		double tmp = discountPrice();
		return tmp;

	}
}
