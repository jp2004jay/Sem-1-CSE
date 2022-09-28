package folder.folder1.folder2;

public class Array
{
	public static void main(String [] args)
	{
		int arr[]={12, 16, 19, 23, 34, 65};
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for(int j=arr.length-1; j>=0; j--)
		{
			System.out.println(arr[j]);
		}
	}
}