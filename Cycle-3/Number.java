import java.util.Scanner;

class Number {
	
	   int num,Fac=1,i=1,sum=0,rem;
	   
	   public static void main(String args[]){
		   Number numbr=new Number();
		   numbr.read();
		   numbr.factorial();
		   numbr.sum();
	   }
	   
	   void read(){
		   System.out.println("Enter a number");
		   Scanner obj=new Scanner(System.in);
		   num=obj.nextInt();
	   }
	   
	   void factorial(){
		   while(i<=num){
			   Fac=Fac*i;
			   i++;
			   }
		   System.out.println("The factoral of the number is: "+Fac);
	   }
	   
	   void sum() {
		   while(num>0) {
			   rem=num%10;
			   sum+=rem;
			   num/=10;
			   }
		   System.out.println("The sum of digits of a number is: "+sum);
	   }

}
