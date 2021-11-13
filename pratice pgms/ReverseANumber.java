import java.util.Scanner;
class ReverseANumber
{
	public static void main(String[] args)
	{
		int a,b,c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		a=scan.nextInt();
		while(a!=0)
		{
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		System.out.print("reversed number is : "+c);
	}
}