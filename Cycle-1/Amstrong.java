import java.util.*;
class Amstrong
{
 public static void main(String args[])
 {
  int i,num,sum=0,m,temp;
  System.out.println("Enter a number");
  Scanner obj=new Scanner(System.in);
  num=obj.nextInt();
  temp=num;
  while(temp>0)
  {
  m=temp%10;
  i=m*m*m;
  sum=sum+i;
  temp=temp/10;
  }
  if(sum==num)
    {
      System.out.println("Number is amstrong");
    }
  else
    { 
      System.out.println("The number is not amstrong");
    }
 }
}
  
    
