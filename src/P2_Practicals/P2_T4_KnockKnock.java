package P2_Practicals;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.*;



public class P2_T4_KnockKnock {

	public static void main(String[] args) throws InterruptedException {
		String name = JOptionPane.showInputDialog("What is your name?");
		int reply =JOptionPane.showConfirmDialog(null, "Hello " + name + "! Would you like to hear a joke ?","question", JOptionPane.YES_NO_OPTION);
		if(reply==JOptionPane.YES_OPTION) {
			
			String a = JOptionPane.showInputDialog("Knock, Knock!");
			final JOptionPane optionPane = new JOptionPane(" .    .    .    .", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

			final JDialog dialog = new JDialog();
			dialog.setTitle("");
			dialog.setModal(true);

			dialog.setContentPane(optionPane);

			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.pack();

			//create timer to dispose of dialog after 5 seconds
			Timer timer = new Timer(3000, new AbstractAction() {
			    @Override
			    public void actionPerformed(ActionEvent ae) {
			        dialog.dispose();
			    }
			});
			timer.setRepeats(false);//the timer should only go off once

			//start timer to close JDialog as dialog modal we must start the timer before its visible
			timer.start();

			dialog.setVisible(true);
			
			
			//!!! I used Stack overflow, Thanks to David Kroukamp !!!
			
			
			JOptionPane.showMessageDialog(null, "Its JAVA :D");
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Ok Then. Have a nice day "+name+"!");
		}
				 
	}

}
