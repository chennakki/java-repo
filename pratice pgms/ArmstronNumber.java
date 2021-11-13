import java.util.Scanner;
class ArmstronNumber
{
	public static void main(String[] args)
	{
		int n,n1,d,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is armstrong number or not : ");
		n=sc.nextInt();
		n1=n;
		while(n!=0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(n1==s)
		{
		System.out.println("it is an armstrong number ");
		}
		else
		{
			System.out.println("it is not an armstrong number");
		}
			

	}
}

