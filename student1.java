import java.util.Scanner;
public class student1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the first name: ");
		String first1 = keyboard.nextLine();
		System.out.print("Input the last name: ");
		String last1 = keyboard.nextLine();
		System.out.format("%-10s %-10s", "Last Name", "First Name");
		System.out.format("\n%-10s %-10s\n", last1, first1);
	}
}