/*
 <Applet
Code = "CheckBoxDemo1.class"
 Width = 1200
 Height = 800>
 </Applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckBoxDemo1 extends Applet implements ItemListener
{
 Checkbox cb1, cb2, cb3, cb4, cb5;
 public void init()
 {
 setLayout(new FlowLayout(50,50,FlowLayout.LEFT));
 setBackground(Color.CYAN);
 setForeground(Color.BLACK);
 setFont(new Font("SansSerif", Font.BOLD, 50));
 cb1 = new Checkbox("C");
cb2 = new Checkbox("C++");
 cb3 = new Checkbox("Java");
 cb4 = new Checkbox("PYTHON");
 cb5 = new Checkbox("C#");

 add(cb1);
 add(cb2);
 add(cb3);
 add(cb4);
 add(cb5);
 cb1.addItemListener(this);
 cb2.addItemListener(this);
 cb3.addItemListener(this);
 cb4.addItemListener(this);
 cb5.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 repaint();
}
 public void paint(Graphics g)
{
 g.drawString("C : " + cb1.getState(),50,200);
 g.drawString("C++ : " + cb2.getState(),50,300);
 g.drawString("Java : " + cb3.getState(),50,400);
 g.drawString("PYTHON : " + cb4.getState(),50,500);
 g.drawString("C# : " + cb5.getState(),50,600);
 }
} 
