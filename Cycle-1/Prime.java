import java.util.*;
class Prime
{
 public static void main(String args[])
 {
  int num,i;
  System.out.println("Enter a number");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  for(i=2;i<num/2;i++)
     {
       if(num%i==0)
         {
           num=0;
           break;
         }
     }
   if(num==0)
   {
   System.out.println("Entered number is not prime");
   }
   else
   {
   System.out.println("Entered number is prime");
   }
 }
}
