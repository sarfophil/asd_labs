package state.functor;

import state.statemodule.CarState;

public interface GearFunctor {
	public CarState apply();
}
