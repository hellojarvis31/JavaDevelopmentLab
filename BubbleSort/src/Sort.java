
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {9,8,7,6,5,4,3,2,1,0};
		
		sortAscending(array);
		
		System.out.println();
		
		sortDescending(array);

	}
	
	public static void sortAscending(int array[])
	{
		int temp = 0;
		for(int j = 0 ; j < array.length - 1; j++)
		{
			for(int i = 0; i < array.length - 1; i++)
			{
				if(array[i] > array[i + 1])
				{
					//swap(array, i, i + 1 );
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
		}
		
		printArray(array);
		
	}
	
	public static void sortDescending(int array[])
	{
		int temp = 0;
		for(int j = 0 ; j < array.length - 1; j++)
		{
			for(int i = 0; i < array.length - 1; i++)
			{
				if(array[i] < array[i + 1])
				{
					//swap(array, i, i + 1 );
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
		}
		
		printArray(array);
		
		
	}
	
	/*public static void swap(int array[], int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = array[i];
	} */
	
	public static void printArray(int array[])
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
	
	public static int findSmallestValue(int array[])
	{
		int smallest = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
		}
		return smallest;
		
	}
	
	public static int findLargestValue(int array[])
	{
		int largest = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}
		return largest;
		
	}
	
	public static int findIndex(int array[], int num)
	{
		
		int index = -1;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == num)
			{
				index = i;
			}
			
		}
		return index;
	}
}
