import java.util.Scanner;
public class rectangle1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the length of each siade of the polygon? ");
		int length = keyboard.nextInt();
		System.out.print("how many sides is the polygon? ");
		int sides = keyboard.nextInt();
		int perimeter = length*sides;
		System.out.println("length: "+length+" sides: " +sides);
		System.out.println("perimeter: " +perimeter);
	}
}

