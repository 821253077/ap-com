import java.util.Scanner;
public class fahrenheit1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("what is the temperature at fahrenheit? ");
        double F = keyboard.nextDouble();
        double c = 5.0/9.0*(F-32);
        System.out.println("C "+c);
	}
}