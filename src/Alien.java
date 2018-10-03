import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Alien {
	
	private static final int HEAD_DIMENSION = 100;
	
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/2 + 12;
	
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 30;

	public void draw(Graphics g, int alienX, int alienY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=alienX;
		int y=alienY;
		// Draw the head
		g2.setColor(Color.green);
		g2.fillOval(x, y, HEAD_DIMENSION+20, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.black);
		x = alienX + EYE_X - 12; 
		y = alienY + EYE_Y + 12;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Greetings earthling!", alienX, alienY+HEAD_DIMENSION+10);	
	}
}

