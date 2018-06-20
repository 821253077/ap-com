import java.util.Scanner;
public class triangle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	    System.out.print(" press 1 for calculating a side for triangle, press 2 for caculating athe hypotenuse for triangle.");
	    double num = keyboard.nextDouble();
	    double side1 = 0;
	    double hypotenuse = 0;
	    double side2 = 0;
	    double hypo = 0;
	    if (num == 1)
	    {
			System.out.print("what is a side of the triangle?");
			side1 = keyboard.nextDouble();
			System.out.print("what is the hypotenuse of the triangle?");
			hypotenuse = keyboard.nextDouble();
			side2 = Math.sqrt((hypotenuse*hypotenuse)-(side1*side1));
			System.out.println("side1: " +side1);
			System.out.println("side2: " +side2);
			System.out.println("hypotunuse: " +hypotenuse);
		}
		else if (num == 2)
		{
			System.out.print("what is a side of the triangle?");
			side1 = keyboard.nextDouble();
			System.out.print("what is another side of the triangle?");
			side2 = keyboard.nextDouble();
			hypo = Math.sqrt((side1*side1)+(side2*side2));
			System.out.println("side1: " +side1);
			System.out.println("side2: " +side2);
			System.out.println("hypotunuse: " +hypo);
		}
	}
}



