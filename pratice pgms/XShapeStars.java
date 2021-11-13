class XShapeStars
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(6-2*i)+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=2;i++)
		{
			for(k=2;k<=k-i;k++)
			{
				System.out.print(" ");
			}
			for(j=3;j<=2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}