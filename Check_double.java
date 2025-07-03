import java .util.Scanner;
public class problem2
{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first Number : ");
		if(sc.hasNextDouble())
		{
			System.out.println("Not Double");
		}
		else
		{
			double no1=sc.nextDouble();
			System.out.print("Enter Second Number : ");
			double no2=sc.nextDouble();
			double avg=(no1+no2)/2;
			System.out.println("Average:"+avg);
		}
		
    }
}