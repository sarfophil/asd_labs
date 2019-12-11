package layeredproxy.component;

import java.time.LocalDateTime;

public class ProxyTimingAccount<T> implements Account<T>{
	
	private Account<T> account;
	
	public ProxyTimingAccount(Account<T> account) {
		this.account = account;
	}

	@Override
	public void compute(T balance) {
		System.out.println("Pre Time "+LocalDateTime.now());
		account.compute(balance);
		System.out.println("Post Time "+LocalDateTime.now());
	}

}
