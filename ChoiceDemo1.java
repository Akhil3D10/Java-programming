/*
 <Applet
 Code = "ChoiceDemo1.class"
 Width = 1000
 Height = 800>
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo1 extends Applet implements ItemListener
{
 Choice l;
 String sopt();
 int iopt();
 public void init()
 {
 setBackground(Color.ORANGE);
 setForeground(Color.BLACK);
 setFont (new Font("Serif", Font.PLAIN, 50));
 l = new Choice();
 l.add("C");
 l.add("C++");
 l.add("VC++");
 l.add("DS/C");
 l.add("JAVA");
 l.add("DS/C++");
 l.add("C#");
 l.add("DS/JAVA");
 l.add("ORACLE");
 l.add("VB");
 l.select(0);
 add(l);
 l.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 sopt = l.getSelectedItem();
 iopt = l.getSelectedIndex();
 repaint();
 }
 public void paint(Graphics g)
 {
 int i,n=0,y=400;
 g.drawString("Selected Options are ...", 10,y);
 if (sopt!=null)
 n = sopt.length;
 for (i=0; i<n; i++)
 {
 y+=40;
 g.drawString(iopt[i] + " " + sopt[i],10,y);
 }
 }
} 
