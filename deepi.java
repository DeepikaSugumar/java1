
public class number {

	public static void main(String[] args) {

		if(args.length==0)
		{ 
			System.out.println("An integer number as argument is expected");
		}
		
		else 
			{
			int a;
		    a=Integer.parseInt(args[0]);
			if(a==0)
	
		{
			System.out.println(+a+ " is neither positive nor negative");
		}
		else if(a>0)
		{
			System.out.println(+a+ "  is positive number");
		}
		else
		{
			System.out.println(+a+ " is negative number");
		}

	}


	}

}
