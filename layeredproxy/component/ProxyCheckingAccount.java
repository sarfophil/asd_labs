package layeredproxy.component;

public class ProxyCheckingAccount<T> implements Account<T>{
	
	private Account<T> account;
	
	public ProxyCheckingAccount(Account<T> account) {
		this.account = account;
	}

	@Override
	public void compute(T balance) {
		System.out.println("Pre executed");
		account.compute(balance);
		System.out.println("Post executed..");
	}

}
