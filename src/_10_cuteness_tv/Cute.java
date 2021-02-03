package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cute implements ActionListener {
	JFrame frame = new JFrame();
	 JButton button = new JButton();
	 JButton butto = new JButton();
	 JButton b = new JButton();
	 JPanel pan = new JPanel();
	public void Cuteness() {
		frame.add(pan);
		 button.setText("frog");
	     butto.setText("duck");
	     b.setText("unicorns");
			 
		
		 pan.add(butto);
		 pan.add(button);
		 pan.add(b);
	     frame.setVisible(true);
	     
	     
	     
	     frame.pack();
	     button.addActionListener(this);
	     butto.addActionListener(this);
	     b.addActionListener(this);
	     
	}
	void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }

	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed.equals(b)){
			showFluffyUnicorns();
		}
		if(buttonPressed.equals(butto)) {
			showDucks();
		}
		if(buttonPressed.equals(button)) {
			showFrog();
		}
		
	}
	

}
