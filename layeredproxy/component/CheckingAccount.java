package layeredproxy.component;

public class CheckingAccount<T> implements Account<T>{

	@Override
	public void compute(T balance) {
		System.out.println("Delegate: "+balance);
	}

}
