import java.util.*;
class Fibanacci
{
 public static void main(String args[])
 {
  int num,f=0,s=1,sum,i,n;
  System.out.println("Enter number of elements");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  for(i=3;i<=n;i++)
   {
     sum=f+s;
     System.out.println(+sum);
     f=s;
     s=sum;
   }
 }
}
