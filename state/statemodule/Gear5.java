package state.statemodule;

public class Gear5 implements GearState{
	
	private int speed;
	
	public Gear5(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		return 5;
	}

	

}
