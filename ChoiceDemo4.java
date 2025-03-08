/*
 <Applet
 Code = "ChoiceDemo4.class"
 Height = 600
 Width = 900 >
 </Applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo4 extends Applet implements ItemListener
{
 Choice ch;
 public void init()
 {
 setFont (new Font("SansSerif", Font.BOLD, 30));
 ch = new Choice();
 String [] c = {"Green", "Blue" , "Yellow", "Pink", "Orange", "Red", "Cyan", "Magenta", "Black", "White"};
 for (int i=0; i<10 ; i++)
 ch.add(c[i]);
 ch.select("White");
 add(ch);

 ch.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent ie)
 {
 String opt = ch.getSelectedItem();
 switch(opt)
 {
 case "Green" : setBackground(Color.green); break;
 case "Blue" : setBackground(Color.blue); break;
 case "Yellow" : setBackground(Color.yellow); break;
 case "Pink" : setBackground(Color.pink); break;
 case "Orange" : setBackground(Color.orange); break;
 case "Red" : setBackground(Color.red); break;
 case "Cyan" : setBackground(Color.cyan); break;
 case "Magenta" : setBackground(Color.magenta); break;
 case "Black" : setBackground(Color.black); break;
 case "White" : setBackground(Color.white); break;
 }
 repaint();
 }
 public void paint(Graphics g)
 { }
} 