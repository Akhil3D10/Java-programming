/*
<Applet
Code="GraphicsDemo0A.class"
Height=600
Width=900>
</Applet>*/
import java.awt.Graphics;
import java.awt.Color;
import java.applet.*;
public class GraphicsDemo0A extends Applet
{
	public void init()
	{
	  setBackground(Color.CYAN);
	  setForeground(Color.BLACK);
	}

	public void paint(Graphics g)
	{
	int x[]={100,300,500,400,200};
	int y[]={300,100,300,500,500};
	g.drawPolygon(x,y,5);
	}
}