package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects implements ActionListener {
	JFrame frame = new JFrame();
	 JButton button = new JButton();
	 JButton butto = new JButton();
	 JPanel pan = new JPanel();
 public void effects() {
	 
	 frame.add(pan);
	 button.setText("boing");
     butto.setText("ring");
		 
	
	 pan.add(butto);
	 pan.add(button);
	 
     frame.setVisible(true);
     
     
     
     frame.pack();
     button.addActionListener(this);
     butto.addActionListener(this);
     
 }

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	
	
	if(buttonPressed.equals(button)) {
		playNoise("service-bell_daniel_simion.wav");
	}
	else if(buttonPressed.equals(butto)) {
		playNoise("Jump-SoundBible.com-1007297584.wav");
	}
	
} 
private void playNoise(String soundFile) {
	 	String path = "src/_09_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	}
}




