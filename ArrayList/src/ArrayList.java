
public class ArrayList {
	
	private int[] arrayOfInt = new int[10];
	
	public ArrayList()
	{
		for(int i = 0; i < 10; i++)
		{
			arrayOfInt[i] = i;
		}
	}
	
	public void printArray()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(arrayOfInt[i]);
		}
	}
	
	public int getHighestNumber()
	{
		int heighest = arrayOfInt[0];
		for(int i = 0; i < arrayOfInt.length; i++)
		{
			if(arrayOfInt[i] > heighest)
			{
				heighest = arrayOfInt[i];
			}
		}
		
		
		return heighest;
	}
	
	public int[][] splitArray()
	{
		int[][] intTwoDim = null;
		int n = arrayOfInt.length;
		
		int array1[] = new int[( n + 1 ) / 2];
		int array2[] = new int[n - array1.length];
		
		for (int i = 0; i < array1.length; i++ ) {
			array1[i] = arrayOfInt[i];
		}
		for (int j = 0; j <array2.length; j++ ) {
			array2[j] = arrayOfInt[j + array2.length];
		}
		
		intTwoDim = new int[2][array1.length];
		
		for(int i = 0; i < array1.length; i++)
		{
			intTwoDim[0][i] = array1[i];
			intTwoDim[1][i] = array2[i];
		}
		
		return intTwoDim;
	}
	
	public void isOddNumer()
	{
		
	}
	
	public void print2DArray(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
	}



}
