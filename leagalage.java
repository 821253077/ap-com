import java.util.Scanner;
public class leagalage
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your age? ");
		int age = keyboard.nextInt();
		boolean canSmoke = age >=18;
		boolean canDrink = age >=21;
		boolean canRentCar = age >=25;
		boolean canRetire = age >=67;
		System.out.println("you can smoke: " +canSmoke);
		System.out.println("you can Drink: " +canDrink);
		System.out.println("you can Rent car: " +canRentCar);
		System.out.println("you can Retire: " +canRetire);
	}
}