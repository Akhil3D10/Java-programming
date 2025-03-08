/*
<Applet
Code="GraphicsDemo0.class"
Height=600
Width=900>
</Applet>*/
import java.awt.Graphics;
import java.awt.Color;
import java.applet.*;
public class GraphicsDemo0 extends Applet
{
	public void init()
	{
	  setBackground(Color.CYAN);
	  setForeground(Color.BLACK);
	}

	public void paint(Graphics g)
	{
	int x[]={100,300,500,400,200,100};/*100,300,500,400,200,100*/
	int y[]={300,100,300,500,500,300};/*300.100,300,500,500,300*/
	for (int i=0;i<5;i++)
		g.drawLine(x[i],y[i],x[i+1],y[i+1]);
	}
}