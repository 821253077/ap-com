import java.util.Scanner;
public class celcius1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("what is the temperature at celcius? ");
        double C = keyboard.nextDouble();
        double F = C*9.0/5.0+32;
        System.out.println("F: "+F);
	}
}