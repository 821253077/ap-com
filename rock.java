import java.util.Scanner;
public class rock
{
	public static void main(String[] arg)
	{
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("welcome to the rock-paper-scissors?");
	   boolean gameover = false;
	   int currentplayer = 1;
	   while (!gameover)
	   {
		   System.out.println("Let's play!");
		   System.out.print("player 1 - enter 1)rock 2)paper 3)scissors: ");
		   int pl = keyboard.nextInt();
		   System.out.print("player 2 = your turn!");
		   System.out.print("player 2 - enter 1)rock 2)paper 3)scissors: ");
		   int pl2 = keyboard.nextInt();
		   if (pl == pl2)
		   {
			   System.out.print("It is a tie!");
		   }
		   else if (pl == 1)
		   {
			   if (pl2 == 3)
			   {
				  System.out.print("player1 win!");
			  }
			  else
			  {
				  System.out.print("player2 win!");
			  }
		  }
		  else if (pl == 2)
		  {
			  if (pl2 == 1)
			  {
				  System.out.print("player1 win!");
			  }
			  else
			  {
				  System.out.print("player2 win!");
			  }
		  }
		  else if (pl ==3)
		  {
			  if (pl2 == 2)
			  {
				  System.out.print("player1 win!");
			  }
			  else
			  {
				  System.out.print("player2 win!");
			 }
		 }
		 System.out.println("Type 1 for start another game , any other number to quit");
		 int cho = keyboard.nextInt();
		  if (cho != 1)
		   {
			   gameover = true;
		   }
	   }
	 }
 }
