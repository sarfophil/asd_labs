package state.statemodule;

public class Gear3 implements GearState {

	private int speed;
	private GearState nextGear;

	public Gear3(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if(speed > 20 && speed <= 40) {
			return 3;
		}else {
			nextGear = new Gear4(speed);
			return nextGear.shift();
		}
	}

}
