/*
 <applet
 code = "ButtonDemo11.class"
 height = 400
 width = 600>
 </applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo11 extends Applet implements ActionListener
{
 Button b1;
 Font f;
 int cnt=0;
 public void init()
 {
 f = new Font("SansSerif",Font.BOLD,30);
 setBackground(Color.CYAN);
 setForeground(Color.BLUE);
 setFont(f);
 b1 = new Button("Click Here");
 b1.setFont(f);
 add(b1);
 b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
 cnt++;
 repaint();
 }
 public void paint(Graphics g)
 {
 String s = "Button is Clicked for " + cnt + " times.";
 g.drawString (s, 10, 300);
 }
}