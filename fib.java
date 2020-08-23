package project_2;

public class fib {
	
	public static void main(String[] args)
	{
		int a,b,n,i;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		n = Integer.parseInt(args[2]);
		i = Integer.parseInt(args[3]);
		System.out.print(a);
        fibi(a,b,n,i);	
        
	}
	static void fibi(int a,int b,int n,int i)
	{
		if(i==n-1)
		{
			System.out.print(" " + b);
		}
		else
		{
		i++;
		System.out.print(" " + b);
		fibi(b,a+b,n,i);
		}
		
	}
}
