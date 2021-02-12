package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		drawPointyRoof("medium");
		grass();
		drawFlatRoof();
		grass();
		
	}		
	static void grass() {
		Robot rob = new Robot();
		rob.setPenColor(0,250,0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
	}
		static void drawPointyRoof(String Height) {
int height = 0;
			if(Height.equals("small")) {
				height = 60;
			}
			else if(Height.equals("medium")) {
				height = 120;
			}
Robot rob = new Robot();
rob.setSpeed(height);
rob.setPenColor(255,20,147);
rob.setX(0);
rob.setY(450);
rob.penDown();
rob.move(100);
rob.turn(45);
rob.move(25);
rob.turn(90);
rob.move(25);
rob.turn(45);
rob.move(100);

	}
		static void drawFlatRoof() {
			Robot rob = new Robot();
			rob.setSpeed(100);
			rob.move(250);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(250);
		}

}
