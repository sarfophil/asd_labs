package layeredproxy;

import layeredproxy.component.Account;
import layeredproxy.component.CheckingAccount;
import layeredproxy.component.ProxyCheckingAccount;
import layeredproxy.component.ProxyTimingAccount;

public class SimpleFactory {
	
	public static Account<Double> getAccount() {
		Account<Double> account = new CheckingAccount<>();
		Account<Double> proxyAccount = new ProxyCheckingAccount<Double>(account);
		return new ProxyTimingAccount<Double>(proxyAccount);
	}

}
