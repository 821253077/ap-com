import java.util.Scanner;
public class madlib
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Name of a famous person: ");
		String Person1 = keyboard.nextLine();
		System.out.print("Name a flower: ");
		String flower1 = keyboard.nextLine();
		System.out.print("Name a month: ");
		String month1 = keyboard.nextLine();
		System.out.print("Name a game: ");
		String game1 = keyboard.nextLine();
        System.out.println("Mr."+Person1+" are very old, looks like a "+flower1+" born in "+month1+" and like a game call "+game1+".");
	}
}
