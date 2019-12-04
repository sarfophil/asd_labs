/**
 * 
 */
package commandpattern.command;

/**
 * @author SARFO PHILIP
 *
 */
public abstract class CommandHistory {

	abstract void run();

	abstract void addHistory(Command command);
	

	abstract void pop();
	
	

}
