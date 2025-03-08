/*
 <Applet
 Code = "MouseDemo1.class"
 Height = 900
 Width = 1200 >
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo1 extends Applet implements MouseListener
{
	String msg="";
	public void init()
	{
		setBackground(Color.CYAN);
		setForeground(Color.BLACK);
		setFont(new Font("SansSerif",Font.ITALIC,50));
		addMouseListener(this);
		
	}
	public void mousePressed(MouseEvent me)
	{	}
	public void mouseReleased(MouseEvent me)
	{	}
	public void mouseEntered(MouseEvent me)	
	{   }
	public void mouseExited(MouseEvent me)	
	{   }
	public void mouseClicked(MouseEvent me)	
	{  
		x=me.getX();
		y=me.gerY();
		repaint(); 
	}
	public void paint(Graphics g)
	{	
		msg=x+","+y;
		g.drawString(msg,x,y);
	}
}