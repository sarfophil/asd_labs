package layeredproxy;

import layeredproxy.component.Account;

public class App {
	
	public static void main(String[] args) {
		Account<Double> account = SimpleFactory.getAccount();
		account.compute(90.0);
	}

}
