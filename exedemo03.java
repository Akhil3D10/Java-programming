class exedemo03
{
public static void main(String[] args)
	{
	    int a,b,c;
	    try
	    {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("c="+c);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	     System.out.println("insufficient number of args passed");
	    }
		catch(NumberFormatException e)
		{
			System.out.println("args are not integers");
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}

	    System.out.println("program is completed");
	}
}
