package state.functor;

import state.statemodule.GearState;

public interface Transmission {
	public GearState apply(int speed);
}
