
public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,i=2;
		while(i<a)
		{
			if(a%i==0)
			{
				System.out.println("Not prime");
				break;
			}
			else
				i++;
		}
		if(i==a)
		System.out.println("Prime");
	}

}
