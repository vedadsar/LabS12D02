package vjezbe;
import java.awt.AWTException;
import java.awt.Robot;

import javax.sound.midi.SysexMessage;

/**
 * Class that moves our mouse to X and Y coordinates to coordinates we enter.
 * @author vedadzornic
 *
 */
public class RobotMouse {
	public static void main(String[] args) {
			Robot r;
		while(true){
			System.out.println("Etner x");
			int x = TextIO.getInt();
			System.out.println("Enter y");
			int y = TextIO.getInt();
				
			try {
			 r = new Robot();
				r.mouseMove(x, y);
			} catch (AWTException e) {
			}			
		}		
	}
}
