/**
 * 
 */
package commandpattern.command;

import commandpattern.Lab4;
import commandpattern.PushDialog;

/**
 * @author SARFO PHILIP
 *
 */
public class PushReceiver {
	private Lab4 frame;
	
	public PushReceiver(Lab4 context) {
		frame = context;
	}
	
	@SuppressWarnings("unchecked")
	public void action() {
		PushDialog  dialog = new PushDialog(frame);
		dialog.setVisible(true);
		frame.getJList().setListData(frame.getStack().getStackVector());
		frame.repaint();
	}
}
