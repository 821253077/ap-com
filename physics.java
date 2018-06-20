import java.util.Scanner;
public class physics
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your grade in precalculus? ");
		double cal = keyboard.nextDouble();
		System.out.print("what is your grade in chemistry? ");
		double chem = keyboard.nextDouble();
		boolean phy = cal >= 79.5 && chem >= 75.5;
		System.out.println("able to take physics: " +phy);
	}
}