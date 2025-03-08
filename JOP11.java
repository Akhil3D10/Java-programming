import static javax.swing.JOptionPane.*;
public class JOP11
{
public static void main(String args[])
{
String s1,s2,s3;
int a,b,c;
s1=showInputDialog("enter the first number");
s2=showInputDialog("enter the secound number");
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a+b;
s3="sum is " + String.valueOf(c);
showMessageDialog(null,s3);
}
}