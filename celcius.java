import java.util.Scanner;
public class celcius
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("what is the temperature at celcius? ");
        int C = keyboard.nextInt();
        int F = C*9/5+32;
        System.out.println("F: "+F);
	}
}
