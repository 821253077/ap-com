import java.util.Random;
import java.util.Scanner;
public class random
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("How manyt times do you want to roll?");
		int numrools = keyboard.nextInt();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		for (int i = 1; i <=numrools; i++)
		{
			int dice = rand.nextInt(6);
			dice++;
			if(dice ==1)
			{
				one ++;
			}
			if (dice==2)
			{
				two ++;
			}
			if (dice ==3)
			{
				three++;
			}
			if (dice ==4)
			{
				four ++;
			}
			if (dice ==5)
			{
				five++;
			}
			if (dice ==6)
			{
				six ++;
		}
			}
		System.out.println("# of 1s: " +one);
		System.out.println("# of 2s: " +two);
		System.out.println("# of 3s: " +three);
		System.out.println("# of 4s: " +four);
		System.out.println("# of 5s: " +five);
		System.out.println("# of 6s: " +six);

	}
}