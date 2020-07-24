
public class CountLetterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charArray = RandomCreateOneHundaredLowercase();
		
		displayArray(charArray);
		
		int countArray[];

	}
	
	public static char[] RandomCreateOneHundaredLowercase()
	{
		char[] charArray = new char[100];
		
		for(int i = 0; i < charArray.length; i++)
		{
			charArray[i] = Random.getRandomLowerCase();
		}
		
		return charArray;
	}

	public static void displayArray(char[] charArray) {
		
		for(int i = 0; i < charArray.length; i++)
		{
			System.out.println(charArray[i]);
		}
	}
	
	/*public static int[] countArray(char charArray[])
	{
		//for()
	}
	*/
}
