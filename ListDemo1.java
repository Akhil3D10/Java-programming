/*
 <Applet
 Code = "ListDemo1.class"
 Width = 1000
 Height = 800>
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ListDemo1 extends Applet implements ItemListener
{
 List l;
 String opt[];
 public void init()
 {
 setBackground(Color.CYAN);
 setForeground(Color.BLACK);
 setFont (new Font("Serif", Font.BOLD, 50));
 l = new List(5, true);
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
 opt = l.getSelectedItems();
 repaint();
 }
 public void paint(Graphics g)
 {
 int i,n=0,y=400;
 g.drawString("Selected Options are ...", 10,y);
 if (opt!=null)
 n = opt.length;
 for (i=0; i<n; i++)
 {
 y+=60;
 g.drawString(opt[i],10,y);
 }
 }
} 
