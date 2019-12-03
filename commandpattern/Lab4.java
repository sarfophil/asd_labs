package commandpattern;

import javax.swing.*;

import commandpattern.command.Command;
import commandpattern.command.PopManager;
import commandpattern.command.PushManager;
import commandpattern.command.RedoManager;
import commandpattern.command.UndoManager;

/* ************************************
 *
 *  Lab4.  
 *
 * ************************************/

public class Lab4 extends javax.swing.JFrame
{
    private VStack stack = new VStack();  // the stack object
    private String pushstring="  "; // the string to push on the stack
    
	public Lab4 ()    
	{
		setTitle("Stack Application"); 
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(480,300);
		setVisible(false);

		JButtonPush.setText("Push");
		getContentPane().add(JButtonPush);
		JButtonPush.setBounds(38,48,110,30);

		JButtonPop.setText("Pop");
		getContentPane().add(JButtonPop);
		JButtonPop.setBounds(38,98,110,30);

		JButtonUndo.setText("Undo");
		getContentPane().add(JButtonUndo);
		JButtonUndo.setBounds(38,144,110,30);

		JButtonRedo.setText("Redo");
		getContentPane().add(JButtonRedo);
		JButtonRedo.setBounds(38,190,110,30);

		JScrollPane scrollPane = new JScrollPane(JList1);
		JList1.setListData(stack.getStackVector());
		scrollPane.setBounds(218,38,160,200);

		getContentPane().add(scrollPane);

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();

		JButtonPush.addActionListener(lSymAction);
		JButtonPop.addActionListener(lSymAction);
		JButtonUndo.addActionListener(lSymAction);
		JButtonRedo.addActionListener(lSymAction);
	
	}

	static public void main(String args[])
	{
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		  
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }

			//Create a new instance of our application's frame, and make it visible.
			(new Lab4()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}


	//
	javax.swing.JButton JButtonPush = new javax.swing.JButton();
	javax.swing.JButton JButtonPop = new javax.swing.JButton();
	javax.swing.JButton JButtonUndo = new javax.swing.JButton();
	javax.swing.JButton JButtonRedo = new javax.swing.JButton();
	javax.swing.JList JList1 = new javax.swing.JList();
	//

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == Lab4.this)
				JFrame1_windowClosing(event);
		}
	}

	void JFrame1_windowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		JFrame1_windowClosing_Interaction1(event);
	}

	void JFrame1_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButtonPush)
				JButtonPush_actionPerformed(event);
			else if (object == JButtonPop)
				JButtonPop_actionPerformed(event);
			else if (object == JButtonUndo)
				JButtonUndo_actionPerformed(event);
			else if (object == JButtonRedo)
				JButtonRedo_actionPerformed(event);
			
		}
	}

	void JButtonPush_actionPerformed(java.awt.event.ActionEvent event)
	{
		Command command = new PushManager(this,pushstring);
		command.execute();		 
	}

	void JButtonPop_actionPerformed(java.awt.event.ActionEvent event)
	{
		Command command = new PopManager(this);
		command.execute();	 
	}

	void JButtonUndo_actionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
		Command command = new UndoManager(this);
		command.execute();
	}

	void JButtonRedo_actionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
		Command command = new RedoManager(this,pushstring);
		command.execute();
			 
	}
	
	public void setPushString (String string){
	    pushstring = string;
	}
	
	public VStack getStack() {
		return stack;
	}
	
	public JList getJList() {
		return JList1;
	}
	

}
