import java.util.Scanner;
public class factor
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the number?");
		int num = keyboard.nextInt();
		int fac = 0;

		while(num>=fac)
		{
			fac++;
			if(num%fac==0)
			{

				System.out.print(" "+fac);
			}
		}
		System.out.println();
	}
}


