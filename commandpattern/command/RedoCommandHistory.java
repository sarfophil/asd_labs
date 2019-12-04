/**
 * 
 */
package commandpattern.command;

import java.util.Stack;

/**
 * @author SARFO PHILIP
 *
 */
public class RedoCommandHistory extends CommandHistory{
	
	private Stack<Command> stack;
	private static CommandHistory instance;
	
	private RedoCommandHistory() {
		stack = new Stack<Command>();
	}
	
	public static CommandHistory getInstance() {
		if(instance == null) {
			instance = new RedoCommandHistory();
			return instance;
		}
		return instance;
	}
	
	@Override
	public void addHistory(Command command) {
		stack.add(command);
	}
	
	@Override
	public void run() {
		Command command = stack.pop();
		command.execute();
	}

	@Override
	void pop() {
		// TODO Auto-generated method stub
		
	}

}
