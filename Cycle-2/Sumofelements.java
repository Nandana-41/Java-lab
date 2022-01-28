import java.util.*;

class Sumofelements

{

  public static void main(String args[])

  {

    int a[]=new int[30];

    int n,i,sum=0;

    Scanner input=new Scanner(System.in);

    System.out.println("How many elements?");

    n=input.nextInt();

    System.out.println("Enter the elements");

    

    for(i=0;i<n;i++)

      a[i]=input.nextInt();

    for(i=0;i<n;i++)

      sum=sum+a[i];

    System.out.println("The sum of the elements is"+" "+sum);

   }

}
