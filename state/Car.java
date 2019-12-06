package state;

import state.functor.Gear;
import state.functor.GearFunctor;
import state.statemodule.CarState;

public class Car{
    public int changeSpeed(int speed){
	    GearFunctor gear = new Gear(speed);
	    CarState state = gear.apply();
	    return state.shift();
    }
}
    
