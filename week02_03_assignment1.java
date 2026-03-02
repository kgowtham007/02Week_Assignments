// A program to check if its leap year using & operator only
import java.util.Scanner;
public class week02_03_assignment1
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the year :");
	int year = input.nextInt();
	if (year>1582 && year%4 == 0 && year % 400 !=0 && year % 100 !=0 ) System.out.println("LEAP YEAR");
	else System.out.println("Not a LEAP YEAR");
  }	
}
