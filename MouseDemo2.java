/*
 <Applet
 Code = "MouseDemo2.class"
 Height = 900
 Width = 1200 >
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo2 extends Applet
{
	String msg="";
	int x,y;
	public void init()
	{
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		setFont(new Font("SansSerif",Font.ITALIC,50));
		addMouseListener(new MouseAdapter()
		{
	
			public void mouseClicked(MouseEvent me)	
			{  
			x=me.getX();
			y=me.getY();
			repaint(); 
			}
		}
	);
}
	public void paint(Graphics g)
	{	
		msg=x + "," + y;
		g.drawString(msg,x,y);
	}
}