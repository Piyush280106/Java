package com.sumbeam;
import java.util.Scanner;
public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Employees");
		int n=sc.nextInt();
		Employee []employees=new Employee[n];
		int count=0,choice;
		do {
			System.out.println("\n\n1.Add Employee\n2.Display All Employees\n3.Search Employee by ID\n4.Display Employees joined in given Year\n5.Find Employee with Maximum Salary\n6.Find Employee with Minimum Salary\n7.Exit the Application\nEnter Choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(count<employees.length)
					{
						System.out.print("\nEnter Employee Name:");
						sc.nextLine();
						String name =sc.nextLine();
						System.out.print("Enter date of Birth:");
						int day=sc.nextInt();
						int month=sc.nextInt();
						int year=sc.nextInt();
						MyDate d1=new MyDate(day,month,year);
						System.out.print("Enter Employee ID:");
						int id=sc.nextInt();
						System.out.print("Enter Deparment :");
						sc.nextLine();
						String depart=sc.nextLine();
						System.out.print("Enter Salary:");
						double salary=sc.nextDouble();
						System.out.print("Enter date of joining:");
						int d=sc.nextInt();
						int m=sc.nextInt();
						int y=sc.nextInt();
						MyDate doj=new MyDate(d,m,y);
						employees[count++]=new Employee(name,d1,id,depart,salary,doj);
					}
					else
					{
						System.out.print("Array full");
					}
					break;
				case 2:
					for(int i=0;i<employees.length;i++) {
						System.out.print(employees[i]);
					}
					break;
					
				case 3:
					System.out.println("Enter Id to search:");
					int search=sc.nextInt();
					boolean found=false;
					for(int i=0;i<employees.length;i++)
					{
						if(employees[i].getId()==search)
						{
							System.out.println("\nEmployee Details of ID :"+search+"\n"+employees[i]);
							found=true;
						}
					}
					if(found!=true)
					{
						System.out.println("Employee not found");
					}
					break;
				case 4:
					System.out.println("Enter the year:");
					int year=sc.nextInt();
					boolean year_found=false;
					for(int i=0;i<employees.length;i++)
					{
						if(employees[i].getDateOfJoining().getYear()==year);
						{
							System.out.println("\nEmployee details of year:"+year+" " +employees[i]);
							year_found=true;
						}
						if(year_found!=true)
							System.out.println("Employee not found");
					}
					break;
				case 5:
					if(count==0)
					{
						System.out.println("No Employee record exist");
						break;
					}
					Employee max_employee=employees[0];
					for(int i=0;i<count;i++)
					{
						if(employees[i].getSalary()>max_employee.getSalary())
							max_employee=employees[i];
					}
					System.out.println("\nEmployee with highest salary is"+max_employee);
					break;
				case 6:
					if(count==0)
					{
						System.out.println("No Employee record exist");
						break;
					}
					Employee min_employee=employees[0];
					for(int i=0;i<count;i++)
					{
						if(employees[i].getSalary()<min_employee.getSalary())
							min_employee=employees[i];
					}
					System.out.println("\nEmployee with highest salary is"+min_employee);
					break;
				case 7:
					break;
			}
		}while(choice!=7);
	}

}
