package commandpattern.command;

import commandpattern.Lab4;

public class PopManager implements Command,Cloneable{

	private Lab4 frame;
	private CommandHistory redoHistory;
	private CommandHistory undoHistory;
	private PopReceiver receiver;
	public PopManager(Lab4 context) {
		frame = context;
		redoHistory = RedoCommandHistory.getInstance();
		undoHistory = UndoCommandHistory.getInstance();
	}


	@Override
	public void execute() {
		frame.getStack().pop();
		receiver = new PopReceiver(frame);
		receiver.action();
		try {
			redoHistory.addHistory((PopManager) this.clone());
			undoHistory.addHistory((PopManager) this.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (PopManager) super.clone();
	}

	

}
