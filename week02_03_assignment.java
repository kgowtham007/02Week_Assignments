// A program to check if its leap year
import java.util.Scanner;
public class week02_03_assignment
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the year :");
	int year = input.nextInt();
	if (year<1582) System.out.println("Not a LEAP YEAR");
	else if ( year%4 != 0 )System.out.println("Not a LEAP YEAR");
	else if (year %100 == 0 && year%400 !=0 ) System.out.println("Not a LEAP YEAR");
	else System.out.println("LEAP YEAR");
  }	
}
