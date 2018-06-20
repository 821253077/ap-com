import java.util.Scanner;
public class rectangle2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the teacher's name? ");
		String teacher = keyboard.nextLine();
		System.out.print("how many student in class1 ");
        int class1 = keyboard.nextInt();
        System.out.print("how many student in class2 ");
        int class2 = keyboard.nextInt();
        System.out.print("how many student in class3 ");
        int class3 = keyboard.nextInt();
        System.out.print("how many student in class4 ");
        int class4 = keyboard.nextInt();
        System.out.print("how many student in class5 ");
        int class5 = keyboard.nextInt();
        int avg = (class1+class2+class3+class4+class5)/5;
        System.out.println("teacher"+teacher);
        System.out.format("%-10s %-6d %-6d %-6d %-6d %-6d\n", "classes", 1, 2, 3, 4, 5);
        System.out.format("%-10s %-6d %-6d %-6d %-6d %-6d\n", "students", class1, class2, class3, class4, class5);
        System.out.println("Average" +avg);
	}
}