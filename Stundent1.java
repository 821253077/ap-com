import java.util.Scanner;
public class Student1
{
	Public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String first1 = keyboard.nextLine();
		String last1 = keyboard.nextLine();
		System.out.format("%-10s %-10s", "Last Name", "First Name");
		System.out.format("\n%-10s %-10s\n", last1, first1);
	}
}
