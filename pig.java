import java.util.Random;
import java.util.Scanner;
public class pig
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		boolean gameover =false;
		int play1 = 0;
		int play2 = 0;
		System.out.print("player1,what is your name ?");
		String pig1 = keyboard.nextLine();
		System.out.print("player2, what is your name? ");
		String pig2 = keyboard.nextLine();
		System.out.println("May the best swine win!");
		while (!gameover)
		{
			System.out.println(pig1+" It is your turn, you have: " +play1+"point");
			int plturn = 0;
			int plturn2 = 0;
			boolean keep = true;
			while (keep)
			{
				int die = rand.nextInt(6)+1;
				plturn += die;

				System.out.println("you Roll:"+die);
				if (die ==1)
				{
					System.out.println(pig1+", your Turn is over. lost all points.");
					plturn = 0;
					keep = false;
					System.out.println(pig1+", your Total point: "+plturn);
				}
				else
				{
					System.out.println(pig1+", your Total point: "+plturn);
					System.out.println(pig1+" do you wish to roll again(1=yes,2=no)?");
					int roll =keyboard.nextInt();
					if(roll ==1)
					{
						keep = true;
					}
					else if (roll ==2)
					{
						keep =false;
					}
				}
		    }
			play1+=plturn;
			if( play1 >=100 )
			{
				System.out.print(pig1+" win!");
				gameover = true;
				continue;
			}
			while (!keep)
			{
				System.out.println(pig2+",  It is your turn, you have: "+play2+"point");


				int dies = rand.nextInt(6)+1;
				System.out.println("Roll:"+dies);
				plturn2 += dies;

				if (dies ==1)
				{
					System.out.println(pig2+", your Turn is over. lost all points.");
					plturn2 = 0;

					keep = true;
					System.out.println(pig2+", your Total point: "+plturn2);
				}
				else
				{
					System.out.println(pig2+",your Total point: "+plturn2);
					System.out.println(pig2+", do you wish to roll again(1=yes,2=no)?");
					int roll =keyboard.nextInt();
					if(roll ==1)
					{
						keep = false;
					}
					else if (roll ==2)
					{
						keep =true;
					}
				}
			}
		    play2 += plturn2;
			if (play2 >= 100)
			{
				System.out.print(pig2+" win!");
				gameover = true;
			}
		}
	}
}



