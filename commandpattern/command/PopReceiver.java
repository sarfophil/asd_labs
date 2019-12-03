package commandpattern.command;

import commandpattern.Lab4;

public class PopReceiver {
	private Lab4 frame;
	
	
	public PopReceiver(Lab4 context) {
		frame = context;
	}
	

	@SuppressWarnings("unchecked")
	public void action() {
		frame.getJList().setListData(frame.getStack().getStackVector());
		frame.repaint();
	}
}
