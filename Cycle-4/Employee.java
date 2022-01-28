import java.util.*;
class Employee
{
	String name;
	int age;
	long phoneno;
	String address;
	long salary;
	
	void print_salary(long salary)
	{
		this.salary=salary;
		System.out.println("Salary:"+salary);
	}
}

class Officer extends Employee
{
	String specialization;
}

class Manager extends Employee
{
	String department;
}

class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		Officer ob1=new Officer();
		
		System.out.println("Enter the details of officer");
		System.out.print("Name:");
		ob1.name=sc.nextLine();
		
		System.out.print("Age:");
		ob1.age=sc.nextInt();
		
		System.out.print("Phone no:");
		ob1.phoneno=sc.nextLong();
		
		sc.nextLine();
		System.out.print("Address:");
		ob1.address=sc.nextLine();
		
		System.out.print("Salary:");
		ob1.salary=sc.nextLong();
		
		sc.nextLine();
		System.out.print("Specialization:");
		ob1.specialization=sc.nextLine();
		
		
		
		Manager ob2=new Manager();
		
		System.out.println("Enter the details of Manager");
		System.out.print("Name:");
		ob2.name=sc.nextLine();

		System.out.print("Age:");
		ob2.age=sc.nextInt();

		System.out.print("Phone no:");
		ob2.phoneno=sc.nextLong();
		
                sc.nextLine();
		System.out.print("Address:");
		ob2.address=sc.nextLine();

		System.out.print("Salary:");
		ob2.salary=sc.nextLong();
		
                sc.nextLine();
		System.out.print("Department:");
		ob2.department=sc.nextLine();
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("The details of the officer is");
		System.out.println("Name:"+ob1.name);
	 
		System.out.println("Age:"+ob1.age);
		
		System.out.println("Phone no:"+ob1.phoneno);
	
		System.out.println("Address:"+ob1.address);
		
		System.out.println("Salary:"+ob1.salary);
		
		System.out.println("Specialization:"+ob1.specialization);
		System.out.println();
		System.out.println();
		
		
		
		
		
		System.out.println("The details of the manager is");
		System.out.println("Name:"+ob2.name);

		System.out.println("Age:"+ob2.age);

		System.out.println("Phone no:"+ob2.phoneno);

		System.out.println("Address:"+ob2.address);

		System.out.println("Salary:"+ob2.salary);

		System.out.println("Department:"+ob2.department);
		
	}
}
