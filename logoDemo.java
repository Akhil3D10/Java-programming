/*
	<applet
		code="logoDemo.class"
		height=600
		width=1000>
	</applet>
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class logoDemo extends JApplet implements ActionListener
{
 JButton jb1,jb2,jb3,jb4;
 ImageIcon ii1,ii2,ii3,ii4;
 JTextField jtf;
 String msg="";
 public void init()
{
 Container c=getContentPane();
 c.setLayout(new FlowLayout(20,20,FlowLayout.CENTER));
 ii1=new ImageIcon("AAA.jpg");
ii2=new ImageIcon("BBB.png");
ii3=new ImageIcon("CCC.png");
ii4=new ImageIcon("DDD.png");
jb1=new JButton(ii1);
jb2=new JButton(ii2);
jb3=new JButton(ii3);
jb4=new JButton(ii4);
jtf=new JTextField(15);
jtf.setFont(new Font("SansSerif",Font.PLAIN,50));
jtf.setBackground(Color.CYAN);
jtf.setForeground(Color.BLACK);
c.add(jb1);
c.add(jb2);
c.add(jb3);
c.add(jb4);
c.add(jtf);
jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
jb4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 msg="you selected ";
 if(ae.getSource()==jb1)
  msg+="google";
 else
  if(ae.getSource()==jb2)
    msg+="apple";
    else
  if(ae.getSource()==jb3)
    msg+="nvidia";
   else
    msg+="MS";
 jtf.setText(msg);
 repaint();
}
public void paint(Graphics g)
{ }
}
   
 



	