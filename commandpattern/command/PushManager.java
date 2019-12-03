/**
 * 
 */
package commandpattern.command;

import commandpattern.Lab4;

/**
 * @author SARFO PHILIP
 *
 */
public class PushManager implements Command {

	private Lab4 frame;
	private CommandHistory history;
	private PushReceiver receiver;
	private String value;
	
	public PushManager(Lab4 context,String value) {
		frame = context;
		history = new CommandHistory();
		this.value = value;
	}

	

	@Override
	public void execute() {
		if (!value.equals("")) {
			frame.getStack().push(this.value);
		}
		history.addHistory(value);
		receiver = new PushReceiver(frame);
		receiver.action();

	}

}
