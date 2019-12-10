package state.statemodule;

public class Gear1 implements GearState{
	
	private GearState nextGear;
	private int speed;
	
	public Gear1(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if(speed > 10 && speed < 20) {
			nextGear = new Gear2(speed);
			return nextGear.shift();
		}
		return 1;
	}

	
}
