package _01_houses;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class Houses {
	Robot rob = new Robot();
	public void run() {
	
		Random ran = new Random();
		
		rob.penDown();
		rob.setX(20);
		rob.setY(500);
		rob.setSpeed(100);
		rob.hide();        
		for(int drawhous = 10; drawhous > 0; drawhous--) {
			int size = ran.nextInt(3);
			if(size==0) {
				drawhouse("small");
			}
			else if(size==1) {
				drawhouse("medium");
			}
			else if(size==2) {
				drawhouse("large");
			}
			
		}
	}
	void drawhouse( int height) {
			rob.setAngle(0);
			rob.move(height);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			
			rob.move(height);
			rob.turn(-90);
			rob.setPenColor(0, 255, 0);
			rob.move(20);
			rob.turn(-90);
			rob.setPenColor(0, 0, 0);
		}
	void drawhouse( String height) {
			if(height.equals("small")){
				drawhouse(60);
			}
			else if(height.equals("medium")) {
				drawhouse(120);
			}
			else if(height.equals("large")) {
				drawhouse(250);
			}
	}
	}



