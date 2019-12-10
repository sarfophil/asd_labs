package state.statemodule;

public class Gear4 implements GearState {

	private int speed;
	private GearState gearState;

	public Gear4(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if (speed > 55) {
			gearState = new Gear5(speed);

			return gearState.shift();
		}

		return 4;
	}

}
