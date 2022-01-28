import java.util.*;

class Replace

{

public static void main(String args[])

  {

    int a[]=new int[30];

    int n,i,remove,replace;

    Scanner input=new Scanner(System.in);

    System.out.println("How many elements?");

    n=input.nextInt();

    System.out.println("Enter the elements");

    

    for(i=0;i<n;i++)

      a[i]=input.nextInt();

   

    System.out.println("Which element should be removed and which element should be placed?");

    remove=input.nextInt();

    replace=input.nextInt();

    for(i=0;i<n;i++)

      if(remove==a[i])

        a[i]=replace;

    System.out.println("The array is");

    for(i=0;i<n;i++)

       System.out.println(a[i]);

  }

}
