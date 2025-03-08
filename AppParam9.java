import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class AppParam9 extends Applet
{
	public void init()
	{
	setBackground(Color.CYAN);
	setForeground(Color.BLUE);
	setFont(new Font("SansSerif",Font.BOLD,50));
	}
	public void paint(Graphics g)
	{
	String s1=getParameter("p1");
	String s2=getParameter("p2");
	int n=Integer.parseInt(s1);
	g.drawString("R.no     :    "+n,10,200);
	g.drawString("name     :    "+s2,10,300);
	}
}