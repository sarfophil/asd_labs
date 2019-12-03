/**
 * 
 */
package commandpattern.command;

import commandpattern.Lab4;

/**
 * @author SARFO PHILIP
 *
 */
public class UndoManager implements Command{
	
	private Lab4 frame;
	private PopReceiver receiver;
	
	public UndoManager(Lab4 context) {
		frame = context;
	}

	@Override
	public void execute() {
		frame.getStack().pop();
		receiver = new PopReceiver(frame);
		receiver.action();
		//history.getTop();
	}

}
