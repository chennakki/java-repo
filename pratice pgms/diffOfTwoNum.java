import java.util.Scanner;
class diffOfTwoNum
{
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st number");
		a=scan.nextInt();
		System.out.println("enter 2nd number");
		b=scan.nextInt();
		c=a-b;
		System.out.println("difference is : "+c);
		d=a*b;
		System.out.println("product is : "+d);
	}
}