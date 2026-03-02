// A program to calculate the power
import java.util.Scanner;
public class week02_02_assignment2
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the number :");
	int number = input.nextInt();
	System.out.println("Enter the power:");
	int power = input.nextInt();
	int answer=1;
	for(int i=1; i<= power; i++)
	{
	  answer = answer * number;
	}
	System.out.println("Final answer: " + answer);
  }
}
