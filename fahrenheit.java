import java.util.Scanner;
public class fahrenheit
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
        System.out.print("press 1 if you want it being calculate in celcuis,press 2 if you want it being calculate in fahrenheit  ");
        double tem = keyboard.nextDouble();
        double C = 0;
        double F = 0;
        if ( tem == 1)
        {
         	System.out.print("what is the temperture at celcuis?");
			C = keyboard.nextDouble();
			F = C*9/5+32;
			System.out.println("F: "+F);
		}
		else if (tem == 2)
		{
			System.out.print("what is the temperture at fahrenheit?");
			F = keyboard.nextDouble();
			C = 5.0/9.0*(F-32);
			System.out.println("C: "+C);
		}
	}
}