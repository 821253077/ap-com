import java.util.Random;
import java.util.Scanner;
public class roulette
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int casino = 10000;
		int player = 100;
		System.out.println("Casino Cash: $"+casino  );
		System.out.println("player cash: $"+player);
		boolean gameover = false;
		while(!gameover)
		{
			System.out.println("Which # do you wish to bet on?(1-36) ");
			int bet = keyboard.nextInt();
			System.out.println("How much do you wish to bet?");
			int money = keyboard.nextInt();
			System.out.println("youu bet on: "+bet);
			int wheel = rand.nextInt(36);
			System.out.println("Roulette wheel: " +wheel);
			if ( bet<=0 || bet>=37)
			  {
				  System.out.println(" .... do it again (1-36) ");
				  continue;
			  }
			if (wheel !=bet)
			{
				int lost = player - money;
				System.out.println("you lost: $"+money);
				int casinos = casino + money;
				System.out.println(" Casino cash: $" +casinos);
				System.out.println(" player cash: $" +lost);
				player += -money;
				casino += money;
				if (lost<= 0)
				{
					System.out.println("gameover");
					gameover = true;
				}
			}
			else if (wheel == bet)
			{
				int lost = player +(money*35);
				System.out.println("you win: $" +money);
				int casinos = casino - (money*35);
				System.out.println(" Casino cash: $" +casinos);
				System.out.println(" Player cash: $" +lost);
				player +=(money*35);
				casino +=-(money*35)-money;
				if (casinos<=0)
				{
					System.out.println("gameover");
					gameover = true;
				}
			}
			System.out.println("do you want to keep play? (Y for yes)(N for no)");
			keyboard.nextLine();
			String keep = keyboard.nextLine();
			if (keep.toUpperCase().equals("Y"))
			{
				gameover = false;
			}
			else if (keep.toUpperCase().equals("N"))
			{
				gameover = true;
		        System.out.println("you have left: $" +player);
			}
		}
	}
}