package commandpattern.command;

import commandpattern.Lab4;

public class PopManager implements Command{

	private Lab4 frame;
	private CommandHistory history;
	private PopReceiver receiver;
	public PopManager(Lab4 context) {
		frame = context;
		history = new CommandHistory();
	}


	@Override
	public void execute() {
		frame.getStack().pop();
		receiver = new PopReceiver(frame);
		receiver.action();
		history.getTop();
	}

	

}
