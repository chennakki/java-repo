import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number ");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("the humber is even ");
		}
		else
		{
			System.out.println("the number is odd ");
		}
	}
}