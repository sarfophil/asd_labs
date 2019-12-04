/**
 * 
 */
package commandpattern.command;

import java.util.Stack;

/**
 * @author SARFO PHILIP
 *
 */
public class UndoCommandHistory extends CommandHistory{
	
	private Stack<Command> stack;
	private static CommandHistory instance;
	
	private UndoCommandHistory() {
		stack = new Stack<Command>();
	}
	
	public static CommandHistory getInstance() {
		if(instance == null) {
			instance = new UndoCommandHistory();
			return instance;
		}
		return instance;
	}

	@Override
	void run() {
		Command command = stack.pop();
		command.execute();
	}

	@Override
	void addHistory(Command command) {
		stack.add(command);
		
	}
	
	@Override
	public void pop() {
		stack.pop();
	}

}
