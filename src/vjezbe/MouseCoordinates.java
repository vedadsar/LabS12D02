package vjezbe;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class which prints X and Y coordinates of mouse on console.
 * @author vedadzornic
 *
 */
public class MouseCoordinates extends JFrame{

	
	public static void main(String[] args) {
		//In main method I created JFrame and JPanel and created Mouse motion listener that i added on JPanel
		MouseCoordinates frame = new MouseCoordinates();
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setUndecorated(true);
		frame.setOpacity(0.3F);
		frame.setContentPane(panel);
		frame.setLocation(500, 500);
		ML ml = new ML();
		panel.addMouseMotionListener(ml);
		frame.setVisible(true);
		
		
	}

	/**
	 * Private class which implements Mouse motion listener. On mouse moved action i'll get 
	 * X and Y coordinates and print then on console.
	 * @author vedadzornic
	 *
	 */
	private static class ML implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("x: " +e.getX() +" y: " +e.getY());
			
		}		
	}
}
