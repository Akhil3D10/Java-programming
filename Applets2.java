/*
 <Applet
 Code = "Demo219A.class"
 Height = 400
 Width = 600 >
 </Applet>
*/
import java.applet.*;
import java.awt.*;
public class Demo219A extends Applet
{
 String s = "";
 int x=10,y=50;
 public void init()
 {
 setBackground(Color.CYAN);
 setForeground(Color.BLUE);
 setFont(new Font("SansSerif", Font.BOLD, 20));
 s = s + "INIT\n ";
 repaint();
 }
 public void start()
 {
 s = s + "START\n";
 repaint();
 }
 public void paint(Graphics g)
 {
 s = s + "PAINT\n";
 g.drawString(s, x, y);
 x = x + 10;
 y = y + 20;
 }
 public void stop()
 {
 s = s + "STOP\n";
 repaint();
 }
 public void destroy()
 {
 s = s + "DESTROY\n";
 repaint();
 }
} 