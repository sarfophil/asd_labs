package state;

import state.functor.Speed;
import state.functor.SpeedFunctor;
import state.statemodule.CarState;

public class Car{
    public int changeSpeed(int speed){
	    SpeedFunctor speedFunctor = new Speed(speed);
	    CarState state = speedFunctor.apply();
	    return state.shift();
    }
}
    
