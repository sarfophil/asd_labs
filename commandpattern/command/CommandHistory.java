/**
 * 
 */
package commandpattern.command;

import java.util.Stack;

/**
 * @author SARFO PHILIP
 *
 */
public class CommandHistory {
	
	private Stack<String> stack = new Stack<String>();
	
	
	public void addHistory(String value) {
		stack.add(value);
	}
	
	public String getTop() {
		return stack.pop();
	}

}
