// A program to check if selected for bonus
import java.util.Scanner;
public class week02_02_assignment1
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the number of years:");
	int years = input.nextInt();
	System.out.println("Enter the salary:");
	int salary = input.nextInt();
	  if(years>=5)
	  {
	    salary = salary + ( salary * 5/100);
	    System.out.println("BONUS salary: " + salary);
	  }
  }
}
