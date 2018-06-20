import java.util.Scanner;
public class num
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1)ascending or 2)descending :");
		int des = keyboard.nextInt();
		System.out.print("input the 5 numbers to be sorted.");
		int int1 = keyboard.nextInt();
		int int2 = keyboard.nextInt();
		int int3 = keyboard.nextInt();
		int int4 = keyboard.nextInt();
		int int5 = keyboard.nextInt();
		for (int i =0; i <5 ; i++)
		{
			if (int1> int2)
			{
			  int temp = int1;
			  int1 = int2;
			  int2 = temp;
		  }
		  if (int2> int3)
		  			{
		  			  int temp = int2;
		  			  int2 = int3;
		  			  int3 = temp;
		  }
		  if (int3> int4)
		  			{
		  			  int temp = int3;
		  			  int3 = int4;
		  			  int4 = temp;
		  }
		  if (int4> int5)
		  			{
		  			  int temp = int4;
		  			  int4 = int5;
		  			  int5 = temp;
				  }
			  }
				  if (des ==1)
				  {
					  System.out.print("ascending order: " +int1+""+int2+""+int3+""+int4+""+int5);
				  }
				  else
				  {
				  System.out.print("descending order: " +int5+""+int4+""+int3+""+int2+""+int1);
			  }
		  }
  }

