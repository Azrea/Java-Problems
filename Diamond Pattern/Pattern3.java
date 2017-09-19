

public class Pattern3
{
	public static void main(String[] args)
	{
		final int SIZE=5;//intialize a constant variable with all CAPS
		for(int i=1;i<=SIZE;i++)//number of lines to be added
		{
			for(int j=SIZE;j>i;j--)//number of * at i line
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
/*
Output:
    *
   **
  ***
 ****
*****
*/
