import java.util.Scanner;
public class quadratic
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the number of a?");
		double a = keyboard.nextDouble();
		System.out.print("what is the number of b?");
		double b = keyboard.nextDouble();
		System.out.print("what is the number of c?");
		double c = keyboard.nextDouble();
		double bc = Math.sqrt(b*b-4*a*c);
		double x2 = (-b+bc)/(a*2);
		double x3 = (-b-bc)/(a*2);
		System.out.println(+a+"x2+"+b+"x+"+c+"=0");
		System.out.println("root1: "+x2);
		System.out.println("root2: "+x3);
	}
}
