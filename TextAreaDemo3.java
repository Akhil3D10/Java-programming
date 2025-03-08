import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
 <Applet
 Code = "ScrollingNews1.class"
 Width = 900
 Height = 300 >
 </Applet>
*/
public class ScrollingNews1 extends Applet
{
	TextField t;
	String a1,s2,s3,s4;
	s1="java is powerfull";
	s2="it is true OOP language";
	s3="i like java very much";
	s4="it can be recommended to Jr's";
	s=s1+s2+s3+s4;
public void init()
{
	setBackground(Color.ORANGE);
	setForeground(Color.WHITE);
	setFont(new Font("SansSerif",Font.ITALIC,50));
	t = new TextField(30);
	add(t);
}
public void paint(Graphics g)
{
	int i,n=s,length();
	for(i=0;i<n-30;i++)
	{
		t.setText(s.Substring(i,i+30));
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{  }
		}
	}
}
		