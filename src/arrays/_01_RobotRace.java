package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
			for(int i=0; i<robots.length; i++) {
				robots [i]=new Robot();
				robots [i].setX(100);
				robots [i].setY(250);
				robots [i].setSpeed(10);
			}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
			boolean isFinished = false;
		for(int j=0; j<30; j++) {
			for(int i=0; i<5; i++) {
				robots [i].move(30);
				robots [i].turn(30);	
				}
		}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
