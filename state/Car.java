package state;

import state.functor.Transmission;
import state.statemodule.Gear0;
import state.statemodule.GearState;

public class Car{
	
	private Transmission transmission;
	
    public int changeSpeed(int speed){
    	transmission = new Transmission() {
			@Override
			public int apply(int speed) {
				GearState gear = new Gear0(speed);
				return gear.shift();
			}
		};
			
	    return transmission.apply(speed);
    }
}
    
