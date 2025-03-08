/*
 <Applet
 Code = "LabelDemo1.class"
 Width = 400
 Height = 200>
 </Applet>
*/								                                                       
import java.applet.*;					   
public class LabelDemo1 extends Applet
{
public void init()
 {
 Label l1 = new Label("C");
 Label l2 = new Label("C++");
 Label l3 = new Label("Java");
 add(l1);
 add(l2);
 add(l3);
 }
} 
