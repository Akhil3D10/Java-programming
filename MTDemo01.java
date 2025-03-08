class BTech
{
	public void meth1()
	{	
		System.out.println("BTech method is started");
		for(int i=1;i<=5;i++)
		System.out.println("BTech -"+i);
		System.out.println("BTech method is completed");
	}
}
class MCA
{
	public void meth2()
	{	
		System.out.println("MCA method is started");
		for(int i=1;i<=5;i++)
		System.out.println("MCA -"+i);
		System.out.println("MCA method is completed");
	}
}
public class MTDemo01
{
	public static void main(String args[])
	{
		BTech p=new BTech();
		MCA   q=new MCA();
		
		p.meth1();
		q.meth2();
	}
}
		