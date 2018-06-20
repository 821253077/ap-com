import java.util.Random;
import java.util.Scanner;
public class roulett1
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
		System.out.println("do you want to play color or number? (c for color)(n for number)");
		String want = keyboard.nextLine();
		if (want.toUpperCase().equals("N"))
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
					  System.out.println(" .... come (1-36) ");
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
						continue;
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

		else if (want.toUpperCase().equals("C"))
		{
					System.out.println("Which color do you wish to bet on?(r for red)(b for black ");
					String bet = keyboard.nextLine();
					System.out.println("How much do you wish to bet?");
					int money = keyboard.nextInt();
					System.out.println("youu bet on: "+bet);
					int wheel = rand.nextInt(36);
				    System.out.println("Roulette wheel: " +wheel);
				if(wheel== 1||wheel== 3||wheel== 5||wheel== 7||wheel== 9||wheel== 12||wheel== 14||wheel== 16||wheel== 18||wheel== 19||wheel== 21||wheel== 23||wheel== 25||wheel== 27||wheel== 30||wheel== 32||wheel== 34||wheel== 36)
				{
					System.out.println("color is: red");
					if(bet.toUpperCase().equals("R"))
					{
						int lost = player +(money);
						System.out.println("you win: $" +money*1);
						int casinos = casino - (money);
						System.out.println(" Casino cash: $" +casinos);
						System.out.println(" Player cash: $" +lost);
						player +=(money*1);
					    casino +=-(money*1);
					}
					else if (bet.toUpperCase().equals("B"))
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
						continue;
					}
				}
			}
				else if (wheel== 2||wheel== 4||wheel== 6||wheel== 8||wheel== 10||wheel== 11||wheel== 13||wheel== 15||wheel== 17||wheel== 20||wheel== 22||wheel== 24||wheel== 26||wheel== 28||wheel== 29||wheel== 31||wheel== 33||wheel== 35)
				{
					System.out.println("color is:black");
					if(bet.toUpperCase().equals("B"))
						{
							int lost = player +(money*1);
				     		System.out.println("you win: $" +money);
							int casinos = casino - (money*1);
							System.out.println(" Casino cash: $" +casinos);
							System.out.println(" Player cash: $" +lost);
							player +=(money*1);
						    casino +=-(money*1);
						}
						else if (bet.toUpperCase().equals("R"))
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
						    continue;
					    }
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
}
