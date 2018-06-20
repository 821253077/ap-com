import java.util.Scanner;
public class perfect
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the number?");
		int num = keyboard.nextInt();

		int sum =0;



				for(int i = 1;i<num; i++)
				{
					int rem = num%i;
					if (rem ==0)
					{
						sum+=i;
						if(sum == num)
						                {
					System.out.print(+num+"is a perfect number.");
				}
			}
		}

				if (sum != num)
				{
					System.out.print(+num+"is not a perfect number.");

		}
	}
}
