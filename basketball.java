import java.util.Scanner;
public class basketball
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("how many minutes is the game? ");
		double min = keyboard.nextDouble();
		if (min == 0)
		{
			System.exit(0);
		}
		System.out.print("how many shots were taken? ");
		double shot = keyboard.nextDouble();
		double twopoint = 0;
		double threepoint = 0;
		if (shot>0)
		{
			System.out.print("how many 2point shots were made? ");
			twopoint = keyboard.nextDouble();
			System.out.print("how many 3point shots. were made? ");
			threepoint = keyboard.nextDouble();
		}
		System.out.print("how many free throws were taken? ");
		double Throw = keyboard.nextDouble();
		double free= 0;
		if (Throw > 0)
		{
			System.out.print("how many free throw they made? ");
			 free = keyboard.nextDouble();
		}
		System.out.print("how many rebounds? ");
		double rebounds = keyboard.nextDouble();
		System.out.print("how many turnovers? ");
		double turnovers = keyboard.nextDouble();
		System.out.print("how many assist? ");
		double assist = keyboard.nextInt();
		double total = twopoint*2+threepoint*3+free;
		double percentage = (twopoint+threepoint)/shot*100;
		double Free = free/Throw*100;
		double per = total/min;
		double ratio = assist/turnovers;
		System.out.println("Total point:" +total);
		System.out.println("Shooting percentage:" +percentage+ "%");
		System.out.println("Free throw percentage:" +Free+ "%");
		System.out.println("Points per minute played:" +per);
		System.out.println("Assist:" +assist);
		System.out.println("Turnover: "+turnovers);
		System.out.println("Assist to Turnover Ratio:" +ratio);
		System.out.println("Rebounds:" +rebounds);
		}
}
