import java.util.Scanner;
public class division
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Wat is the dividend? ");
		int dividend = keyboard.nextInt();
		System.out.print("What is the divisor? ");
		int divisor = keyboard.nextInt();
		int x = dividend/divisor;
		int r = dividend%divisor;
		boolean ExactlyDivisible = ( 0 == r);
		System.out.println("Dividend: " +dividend);
		System.out.println("Divisor: " +divisor);
		System.out.println("Exactly divisible: " +ExactlyDivisible);
		System.out.println("Result: " +x+ "r" +r);
	}
}