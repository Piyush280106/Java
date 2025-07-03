
public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{	
			for(j=1;j<=5;j++)
			{
				if(i+j>5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
