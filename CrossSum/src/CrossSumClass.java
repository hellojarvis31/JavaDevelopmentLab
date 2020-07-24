import java.util.ArrayList;

public class CrossSumClass {
	
	int num;
	
	public CrossSumClass(int data)
	{
		this.num = data;
	}
	
	public void crossSum()
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		int crossSum = 0;
		int quotient = -1;
		String str = "";
		
		int counter = 0;
		while(quotient != 0)
		{
			if(counter == 0)
			{
				arr.add(num % 10);
				quotient = num / 10;
				counter++;
			}
			
			else 
			{
				arr.add(quotient % 10);
				quotient = quotient / 10;
				counter++;
			}
		}
		
		for(int temp: arr)
		{
			crossSum += temp;
		}
		
		for(int i = arr.size()-1; i >= 0; i--)
		{
			if(i != 0)
			{
				str = str + arr.get(i).toString() + " + ";
			}
			
			else
			{
				str = str + arr.get(i) + " = " + crossSum;
			}
			//System.out.print(arr.get(i));
		}
		
		System.out.println(str);
		
		
		
	}

}
