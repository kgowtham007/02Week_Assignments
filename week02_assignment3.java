// A program to check the integer
import java.util.Scanner;
public class week02_assignment3
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the number:");
	int number = input.nextInt();
	if (number>0)
	System.out.println("The number is POSITIVE");
	else
	System.out.println("The number is NEGATIVE");
    if(number ==0)
	System.out.println("The number is ZERO");
  }
}
