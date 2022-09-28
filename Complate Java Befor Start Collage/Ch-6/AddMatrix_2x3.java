package ch_6;
public class AddMatrix_2x3
{
		static void matrixOk (int [][] arr)
	{
		for(int i=0; i<arr.length; ++i)
			{
				for(int j=0; j<arr[i].length; ++j)
				{
					System.out.print(arr[i][j]);
					System.out.print("\t");
				}
				System.out.print("\n");
			}
	}
		
	
	static void matrixAdd (int [][] arr1, int [][] arr2)
	{
		int result [][]={{0, 0, 0},{0, 0, 0}};
		
		for(int i=0; i<arr1.length; ++i)
			{
				for(int j=0; j<arr1[i].length; ++j)
				{
					result[i][j]= arr1[i][j] + arr2[i][j] ;
				}
				System.out.print("\n");
			}
			matrixOk(result);
	}
	
	
		public static void main (String [] args)
	{
		int matrix1 [][] = {{2, 4, 7}, {2, 5, 6}};
		matrixOk(matrix1);
		System.out.print("\n");
		
		int matrix2 [][] = {{3, 1, 2}, {2, 1, 3}};
		matrixOk(matrix2);
		
		matrixAdd(matrix1, matrix2);
	}
}