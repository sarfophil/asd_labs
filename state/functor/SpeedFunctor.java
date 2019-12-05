package state.functor;

import state.statemodule.CarState;

public interface SpeedFunctor {
	public CarState apply();
}
