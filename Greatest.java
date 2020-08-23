package project_2;

public class Greatest {
	public static void main(String args[])
	{
		int arr[] = new int[args.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		int x = great(arr);
		System.out.print("The greatest element is:"+x);
	}
	static int great(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] -arr[j];
					arr[i] = arr[i] -arr[j];
				}
			}
		}
		return (arr[0]);
	}
}
