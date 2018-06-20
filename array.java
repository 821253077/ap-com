import java.util.Scanner;
public class array
{
	public static void main (String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		int[] odd = {1, 3, 5, 7, 9, 11, 13, 15, 23, 25, 27};
		int[] even = { 2,4,22,24,32,34,20,28,26,6,8};
		int[] nega = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-12,-13};
		System.out.println("odd: "+odd[odd]+);
		System.out.println("even: " +even[even]+);
		System.out.println("negative: "+nega[nega]+);
	}
}
