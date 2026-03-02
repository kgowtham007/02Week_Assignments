// A program to find the biggest of 3
import java.util.Scanner;
public class week02_assignment1
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter number 1:");
	int number1 = input.nextInt();
	System.out.println("Enter number 2:");
	int number2 = input.nextInt();
	System.out.println("Enter number 3:");
	int number3 = input.nextInt();
	if(number1>number2 && number1 > number3)
	System.out.println("Is the first number the largest? YES!");
	else 
	System.out.println("Is the first number the largest? NO!");
	if(number2>number1 && number2 > number3)
	System.out.println("Is the second number the largest? YES!");
	else 
	System.out.println("Is the second number the largest? NO!");
	if(number3>number2 && number3 > number1)
	System.out.println("Is the third number the largest? YES!");
	else 
	System.out.println("Is the third number the largest? NO!");
  }
}
