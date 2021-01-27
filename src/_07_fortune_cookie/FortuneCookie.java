package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	        public void showButton() {
	            System.out.println("Button clicked");
	            frame.setVisible(true);
	            frame.add(button);
	            frame.pack();
	            button.addActionListener(this);
	       }
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "WOO HOO");
				int rand = new Random().nextInt(5);
				if(rand==1)	{
					JOptionPane.showMessageDialog(null, "YOU HAVE BUD LUCK FOR SEVEN YEARS");
				}
				else if(rand==2) {
					JOptionPane.showMessageDialog(null, "you have good luck for 10 years!");
				}
				else if(rand==3) {
					JOptionPane.showMessageDialog(null, "2 years from now you will have 1 million dollars");
				}
				else if(rand==4) {
					JOptionPane.showMessageDialog(null, "you will never get old");
				}
				else if(rand==5) {
					JOptionPane.showMessageDialog(null, "nothing interesting will ever happen to you");
				}
			}
 
			
	    }

	

