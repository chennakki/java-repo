import java.util.Scanner;
import java.io.PrintStream;
import java.lang.System;
class CheckPrime
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		n=sc.nextInt();
		for(int i=1;i<=n ;i++)
		{
			if (n%i==0)
			{
				System.out.println("it is prime number ");
			}
			else
			{
				System.out.Println("it is non prime ");
			}
		}
	}
}