package state.statemodule;

public class Gear2 implements GearState {

	private int speed;
	private GearState nextGear;

	public Gear2(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if(speed > 10 && speed <= 20) {
			return 2;
		}else {
			nextGear = new Gear3(speed);
			return nextGear.shift();
		}
	}

}
