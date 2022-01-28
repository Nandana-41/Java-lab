import java.util.*;
class Factor
{
 public static void main(String args[])
 {
  int num,i,Fac;
  System.out.println("Enter a number");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  for(i=1;i<=num;i++)
   {
     Fac=num%i;
     if(Fac==0)
       {
          System.out.println("Factor="+i);
       }
   }
  }
}
