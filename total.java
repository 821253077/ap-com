import java.util.Scanner;
public class total
{
	public static void main(String[] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is saleman's name? ");
		String name = keyboard.nextLine();
		System.out.print("How much did he made? ");
		int money = keyboard.nextInt();
		boolean FirstBonus = (money > 5000);
		boolean SecondBonus = ( money > 10000);
		boolean ThirdBonus = ( money > 15000);
		System.out.println("name: " +name);
		System.out.println("Total Sales: " +money);
		System.out.println("First Bounus: " + FirstBonus);
		System.out.println("Second Bounus; " + SecondBonus);
		System.out.println("Third Bounusl " + ThirdBonus);
	}
}

