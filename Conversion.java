import java.util.Scanner;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int no=sc.nextInt();
		System.out.println("Given No:"+no);
		System.out.println("Binary Equivalent:"+Integer.toBinaryString(no));
		System.out.println("Octal Equivalent:"+Integer.toOctalString(no));
		System.out.println("Hexadecimal Equivalent:"+Integer.toHexString(no));
	}

}
