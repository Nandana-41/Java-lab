import java.util.*;
class Palindrom
{
 public static void main(String args[])
 {
  int num,temp,rem,rev=0;
  System.out.println("Enter a number");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  temp=num;
  while(num>0)
      {
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
      }
      if(rev==temp)
      {
      System.out.println("The number is palindrom");
      }
      else
      {
      System.out.println("The number is not palindrom");
      }
  }
}   
