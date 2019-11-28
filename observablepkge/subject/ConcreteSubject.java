package observablepkge.subject;

public class ConcreteSubject implements Subject{
	private String state;
	
	public ConcreteSubject() {
		state = "Default";
	}
	
	@Override
	public String getState() {
		return state;
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return state;
	}
	

}
