package project_2;

public class Duplicate {
	public static void main(String args[])
	{
		int arr[] = new int[args.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		dup(arr);
	}
	static void dup(int arr[])
	{
		int sum = 0,x=0,k=0;
		int a[] = new int[arr.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				while(k<a.length&&arr[i]!=a[k])
				{
					k++;
				}
				if(arr[i]==arr[j]&&sum==0&&k==arr.length)
				{
					System.out.println(arr[i]);
					sum++;
					a[x] = arr[i];
					x++;
 				}
				k=0;
			}
			sum=0;
		}
	}
	
}
