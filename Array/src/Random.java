
public class Random {
	
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1 ));
	}
	
	public static char getRandomLowerCase()
	{
		return getRandomCharacter('a' , 'b');
	}
	
	public static char getRandomUpperCase()
	{
		return getRandomCharacter('A' , 'B');
	}
	
	public static char getRandomDigitCharacter()
	{
		return getRandomCharacter('0' , '9');
	}
	
	public static char getRandomCharacter()
	{
		return getRandomCharacter('\u0000' , '\uFFFF');
	}
}
