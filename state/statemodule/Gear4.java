package state.statemodule;

public class Gear4 implements GearState {

	private int speed;
	private GearState gearState;

	public Gear4(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if (speed > 40 && speed < 60) {
			return 4;
		} else {
			gearState = new Gear5(speed);
			return gearState.shift();
		}
	}

}
