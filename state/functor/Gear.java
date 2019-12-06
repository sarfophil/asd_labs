package state.functor;

import state.statemodule.CarState;
import state.statemodule.Park;
import state.statemodule.Shift1;
import state.statemodule.Shift2;
import state.statemodule.Shift3;
import state.statemodule.Shift4;
import state.statemodule.Shift5;

public class Gear implements GearFunctor{
	
	private int speed = 0;
	
	public Gear(int speed) {
		this.speed = speed;
	}

	@Override
	public CarState apply() {
		if (speed == 0) {
	        return new Park();
	    } else {
	        if (speed > 0 && speed < 10) {
	            return new Shift1();
	        } else {
	            if (speed > 10 && speed < 20) {
	                return new Shift2();
	            } else {
	                if (speed > 20 && speed < 40) {
	                    return new Shift3();
	                } else {
	                    if (speed > 40 && speed < 60) {
	                        return new Shift4();
	                    } else {
	                        if (speed > 55 ) {
	                            return new Shift5();
	                        }
	                    }
	                }
	            }
	        }
	    }
		return new Park();
	}

}
