 class BTech extends Thread
{
 public void run()
 {
 System.out.println("BTech Method is Started.");
 for (int i=1; i<=5; i++)
 System.out.println("BTech-" + i);
 System.out.println("BTech Method is Completed.");
 }
}
class MCA extends Thread
{
 public void run()
 {
 System.out.println("MCA Method is Started.");
 for (int i=1; i<=5; i++)
 System.out.println("MCA-" + i);
 System.out.println("MCA Method is Completed.");
 }
}
class MTDemo02
{
 public static void main(String args[])
 {
 BTech p = new BTech();
 MCA q = new MCA();
 p.start();
 q.start();
 }
} 
