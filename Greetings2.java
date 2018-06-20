import java.util.Scanner;
public class Greetings2
{
	public static void main(String[] args)
	{
		  Scanner keyboard = new Scanner(System.in);
		  System.out.print("what is your first name? ");
		  String fname = keyboard.nextLine();
		  System.out.print("What is your last name? ");
		  String lname = keyboard.nextLine();
		  System.out.println("Hello "+fname+" "+lname+".");
		  System.out.println("Welcome to JAVA!");
	  }
  }