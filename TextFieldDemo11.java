/*
 <Applet
 Code = "TextFieldDemo11.class"
 Height = 600
 Width = 600>
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo11 extends Applet implements ActionListener
{
 TextField tf1, tf2, tf3;
 Label l1, l2, l3;
 int a,b,c;
 String s1,s2,s3;

 public void init()
 {
 setFont(new Font("SansSerif", Font.BOLD, 50));
 setBackground(Color.CYAN);
 setForeground(Color.BLACK);
 l1 = new Label("First Number ");
 l2 = new Label("Second Number ");
 l3 = new Label("Sum is ");
 tf1 = new TextField(5);
 tf2 = new TextField(5);
 tf3 = new TextField(5);
 add(l1);
 add(tf1);
 add(l2);
 add(tf2);
 add(l3);
 add(tf3);
 tf2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
 s1 = tf1.getText();
 s2 = tf2.getText();
 a = Integer.parseInt(s1);
 b = Integer.parseInt(s2);
 c = a + b;
 s3 = String.valueOf(c);
 tf3.setText(s3);
 repaint();
}
 public void paint(Graphics g)
 { }
} 
