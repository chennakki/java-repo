import java.util.Scanner;
class SwapOfTwoNumbers
{
	public static void main(String[] args)
		{
				
	int a,b,c;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 1st number");
	a = sc.nextInt();
	System.out.println("enter 2nd number");
	b = sc.nextInt();
	c = a;
	a = b;
	b = c;
	System.out.println("1st number is :"+a);
	System.out.println("2nd number is :"+b);
		}
}