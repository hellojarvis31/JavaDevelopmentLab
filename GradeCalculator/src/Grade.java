import java.util.Scanner;

public class Grade {
	
	static int maxMarksQuiz1;
	static int maxMarksQuiz2;
	static int maxMarksQuiz3;
	static int totalMaxMarks;
	static int marksQuiz1;
	static int marksQuiz2;
	static int marksQuiz3;
	static int totalObtainMarks;
	static int obtainPercentage; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the max marks of 1st quiz ");
		
		maxMarksQuiz1 = input.nextInt();
		
		System.out.println("Enter the max marks of 2nd quiz ");
		
		maxMarksQuiz2 = input.nextInt();
		
		System.out.println("Enter the max marks of 3rd quiz ");
		
		maxMarksQuiz3 = input.nextInt();
		
		System.out.println("Enter the obtained marks of 1st quiz ");
		
		marksQuiz1 = input.nextInt();
		
		System.out.println("Enter the obtained marks of 2nd quiz ");
		
		marksQuiz2 = input.nextInt();
		
		System.out.println("Enter the obtained marks of 3rd quiz ");

		marksQuiz3 = input.nextInt();
		
		totalMaxMarks = maxMarksQuiz1 + maxMarksQuiz2 + maxMarksQuiz3;
		totalObtainMarks = marksQuiz1 + marksQuiz2 + marksQuiz3;
		
		obtainPercentage = (totalObtainMarks / totalMaxMarks) * 100;
		
		if(obtainPercentage >= 90)
		{
			System.out.println( "Grade is A and Percantage is " + obtainPercentage );
		}
		
		else if(obtainPercentage >= 80 && obtainPercentage < 90)
		{
			System.out.println( "Grade is B and Percantage is " + obtainPercentage );
		}
		
		else if(obtainPercentage >= 60 && obtainPercentage < 80)
		{
			System.out.println( "Grade is C and Percantage is " + obtainPercentage );
		}
		
		else if(obtainPercentage < 60)
		{
			System.out.println( "Grade is F and Percantage is " + obtainPercentage );
		}
		
		input.close();

	}

}
