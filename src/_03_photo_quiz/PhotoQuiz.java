package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String URL = "https://i.kym-cdn.com/photos/images/newsfeed/001/966/661/fb8";
		// 2. create a variable of type "Component" that will hold your image
		Component com;
		// 3. use the "createImage()" method below to initialize your Component
		com = createImage(URL);
		// 4. add the image to the quiz window
		quizWindow.add(com);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ques = JOptionPane.showInputDialog("do they have drip tho");
		// 7. print "CORRECT" if the user gave the right answer
		if(ques.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT MY BROTHER");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT MY BROTHER");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(com);
		// 10. find another image and create it (might take more than one line
		// of code)
		String Url = "https://media.distractify.com/brand-img/IPJP2rGdp/480x252/walterthedog-1592229773475.jpg";
		com = createImage(Url);
		// 11. add the second image to the quiz window
		quizWindow.add(com);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String quest = JOptionPane.showInputDialog("Walter????????????????????????????????????????????????");
		// 14+ check answer, say if correct or incorrect, etc.
		if(quest.equals("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT MY BROTHER");
		}

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
