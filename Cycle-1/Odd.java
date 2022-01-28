import java.util.*;
class Odd
{
 public static void main(String args[])
 {
  int num,temp;
  System.out.println("Enter a number");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  temp=num%2;
  if(temp==0)
   {
    System.out.println("The number is even");
   }
  else
   {
    System.out.println("The number is odd");
   }
 }
}
