/*
 <Applet
 Code = "CheckBoxGroupDemo1.class"
 Height = 800
 Width = 1200>
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxGroupDemo1 extends Applet implements ItemListener
{
CheckboxGroup cbg;
 Checkbox scb,cb1,cb2,cb3,cb4;

 public void init()
 {
 setLayout(new FlowLayout(50,50,FlowLayout.LEFT));
 setBackground(Color.CYAN);
 setForeground(Color.BLACK);
 setFont(new Font("Serif",Font.BOLD,50));
 cbg = new CheckboxGroup();
 cb1 = new Checkbox("C",cbg,false);
 cb2 = new Checkbox("C++",cbg,false);
 cb3 = new Checkbox("JAVA",cbg,false);
 cb4 = new Checkbox("VC++",cbg,false);
 add(cb1);
 add(cb2);
 add(cb3);
 add(cb4);
 cb1.addItemListener(this);
 cb2.addItemListener(this);
 cb3.addItemListener(this);
 cb4.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 scb = cbg.getSelectedCheckbox();
 repaint();
 }
 public void paint(Graphics g)
 {
 String msg=null;
 g.setColor(Color.MAGENTA);
 if (scb==null)
 msg = "NULL";
 else
 msg = scb.getLabel();
 g.drawString("Your Option : " + msg, 10,250);
 }
} 