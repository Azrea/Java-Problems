

public class Pattern1
{
	public static void main(String[] args)
	{
		final int SIZE=5;//intialize a constant variable with all CAPS
		for(int i=0;i<=SIZE;i++)//number of lines to be added
		{
			for(int j=1;j<i;j++)//number of * at i line
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
/*
OutPut:
*
**
***
****
*****
*/