/**
 * 
 */
package state.statemodule;



/**
 * @author SARFO PHILIP
 *
 */
public class Gear0 implements GearState{
	
	private GearState nextGear;
	private int speed;
	
	public Gear0(int speed) {
		this.speed = speed;
	}

	@Override
	public int shift() {
		if(this.speed > 0) {
			nextGear = new Gear1(speed);
			return nextGear.shift();
		}
		return 0;
	}

	

}
