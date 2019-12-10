package state;

import state.functor.Transmission;
import state.statemodule.Gear0;
import state.statemodule.GearState;

public class Car{
	
	private Transmission transmission;
	
    public int changeSpeed(int speed){
    	transmission = new Transmission() {
			@Override
			public GearState apply(int speed) {
				return new Gear0(speed);
			}
		};
			
	    return transmission.apply(speed).shift();
    }
}
    
