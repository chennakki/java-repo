class Pattern2
{
	public static void main(String[] args)
	{
		int i,j,n=5,x=1,y=1;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=n;j++)
			{
				
				System.out.print(" "+x+" ");
				x+=n;
			}
			System.out.println();
			y=y+1;
			x=y;

		}
	}
}