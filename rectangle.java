import java.util.Scanner;
public class rectangle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the length of the rectangle? ");
		int length = keyboard.nextInt();
		System.out.print("what is the width of the rectangle? ");
		int width = keyboard.nextInt();
		int perimeter = 2*length + 2*width;
        int area = length*width;
        System.out.println("length: "+length+" Width: "+width);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("area: "+ area);
	}
}