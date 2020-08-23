package project_2;

public class Dec_to_bin {
	public static void main(String args[])
	{
		int n,i=0;
		int arr[] = new int[15];
		n = Integer.parseInt(args[0]);
		while(n!=0)
		{
			int a = n%2;
			arr[i] = a;
			i++;
			n = n/2;
		} i--;
		while(i>=0)
		{
			System.out.print(arr[i]);
			i--;
		}
	}
}
