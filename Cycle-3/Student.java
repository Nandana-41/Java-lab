import java.util.*;

class Student{
	
	int rollNumber,i;
	String name;
	float [] marks = new float[6];	
	
	public static void main(String args[]) {
		Student Stud=new Student();
		
		Stud.details();
		Stud.display();
	}
	void details(){
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the Roll Number of the Student : ");
        rollNumber= obj.nextInt();
        
        System.out.println("Enter the Name of the Student : ");
        name = obj.next();
        
        System.out.println("Enter the Marks of 5 subjects of the Student : ");
        for(i=0; i<5; i++)
        	marks[i] = obj.nextFloat();
	}
	void display() {
		
        System.out.println("Roll No : "+rollNumber);
        System.out.println("Name : "+name);
        for(i=1; i<6; i++)
        	System.out.println("Marks of Subject-" + i + " :"+marks[i]);
    
	}
}
 
