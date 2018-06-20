import java.util.Scanner;
public class student3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("student1 last name: ");
		String last1 = keyboard.nextLine();
		System.out.print("student1 first name: ");
		String first1 = keyboard.nextLine();
		System.out.print("student1 ID: ");
		String ID1 = keyboard.nextLine();
		System.out.print("Student2 class: ");
		String Class1 = keyboard.nextLine();
		System.out.print("Student1 Grade: ");
		String grade1 = keyboard.nextLine();
		System.out.print("student2 last name: ");
		String last2 = keyboard.nextLine();
		System.out.print("student2 first name: ");
		String first2 = keyboard.nextLine();
		System.out.print("student2 ID: ");
		String ID2 = keyboard.nextLine();
		System.out.print("Student2 class: ");
		String Class2 = keyboard.nextLine();
		System.out.print("Student2 Grade: ");
		String grade2 = keyboard.nextLine();
		System.out.print("student3 last name: ");
		String last3 = keyboard.nextLine();
		System.out.print("student3 first name: ");
		String first3 = keyboard.nextLine();
		System.out.print("student3 ID: ");
		String ID3 = keyboard.nextLine();
		System.out.print("Student class: ");
		String Class3 = keyboard.nextLine();
		System.out.print("Student3 Grade: ");
		String grade3 = keyboard.nextLine();
		System.out.format("%-10s %-10s %-10s %-10s %-10s", "Last Name", "Fist Name", "Student ID", "Class", "Grade");
		System.out.format("\n%-10s %-10s %-10s %-10s %-10s", last1, first1, ID1, Class1, grade1);
		System.out.format("\n%-10s %-10s %-10s %-10s %-10s", last2, first2, ID2, Class2, grade2);
		System.out.format("\n%-10s %-10s %-10s %-10s %-10s", last3, first3, ID3, Class3, grade3);
	}
}
