import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class AddNumbers_AWT extends Applet
{
	public void init()
	{

		setBackground(Color.blue);
	}

	public void paint(Graphics g)
	{
		g.drawString("Background color is changing ",500,500);
		repaint();

	}
}
