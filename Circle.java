			//circle.java
import java.util.Scanner;
public class Circle
{
	private int r;
	private double a,c;
public void accept()
{
	Scanner snr=new Scanner(System.in);
	System.out.println("enter the radius...");
	r=snr.nextInt();
}
public void calculate()
{
	a=22/7.0*r*r;
	c=2*22/7.0*r;
}
void display()
{
System.out.println("area="+a);
System.out.println("circum="+c);
}
}
/*after typing above class*/