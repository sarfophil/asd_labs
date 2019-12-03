/**
 * 
 */
package commandpattern.command;

import commandpattern.Lab4;

/**
 * @author SARFO PHILIP
 *
 */
public class RedoManager implements Command{
	
	private Lab4 frame;
	private CommandHistory history;
	private String value;
	private PopReceiver receiver;
	
	public RedoManager(Lab4 context,String value) {
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
		receiver = new PopReceiver(frame);
		receiver.action();
	}

	

}
