// A program to check EVEN or ODD
import java.util.Scanner;
public class week02_02_assignment
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter the number:");
	int number = input.nextInt();
	for(int i=1;i<=number; i++)
	{
	  if(i%2==0)
	    System.out.println(i + " is EVEN");	
	  else 
	    System.out.println(i + " is ODD");	
	}
  }
}
