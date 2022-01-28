import java.util.*;

class Smallest

{

public static void main(String args[])

  {

    int a[]=new int[30];

    int n,i,small;

    Scanner input=new Scanner(System.in);

    System.out.println("How many elements?");

    n=input.nextInt();

    System.out.println("Enter the elements");

    

    for(i=0;i<n;i++)

      a[i]=input.nextInt();

    small=a[0];

    for(i=1;i<n;i++)

      if(small>a[i])

        small=a[i];

    System.out.println("The smallest element is"+" "+small);

   }

}
