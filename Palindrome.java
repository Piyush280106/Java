import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args)
    {
        int tmp;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter Number:");
        int no=sc.nextInt();
        tmp=no;
        while(no>0)
        {
            int a=no%10;
            rev=rev*10+a;
            no/=10;
        }
        if(rev==tmp)
            System.err.println("Number is Palindrome"); 
        else
            System.err.println("Number is not Palindrome");
    }
    
}