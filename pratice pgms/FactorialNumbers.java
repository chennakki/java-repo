 import java.util.Scanner;
 class FactorialNumbers
 {
	 public static void main(String[] args)
	 {
		 int n,p=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 p=p*i;
		 }
			 System.out.println(p);
	 }
 }