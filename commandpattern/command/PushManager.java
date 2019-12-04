/**
 * 
 */
package commandpattern.command;

import commandpattern.Lab4;

/**
 * @author SARFO PHILIP
 *
 */
public class PushManager implements Command,Cloneable {

	private Lab4 frame;
	private CommandHistory redoHistory;
	private CommandHistory undoHistory;
	private PushReceiver receiver;
	private String value;
	
	public PushManager(Lab4 context,String value) {
		frame = context;
		redoHistory = RedoCommandHistory.getInstance();
		undoHistory = UndoCommandHistory.getInstance();
		this.value = value;
	}

	

	@Override
	public void execute() {
		if (!value.equals("")) {
			frame.getStack().push(this.value);
		}
		try {
			
			redoHistory.addHistory((Command) this.clone());
			undoHistory.addHistory((Command) this.clone());
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone not supported exception");
			e.printStackTrace();
		}
		receiver = new PushReceiver(frame);
		receiver.action();

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Command) super.clone();
	}
	
	

}
