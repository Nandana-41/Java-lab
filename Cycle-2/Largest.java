import java.util.*;

class Largest

{

public static void main(String args[])

  {

    int a[][]=new int[30][30];

    int r,c,i,j,large;

    

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the number of rows and columns");

      

    r=input.nextInt();

    c=input.nextInt();

    System.out.println("enter the elements");

    for(i=0;i<r;i++)

      for(j=0;j<c;j++)

        a[i][j]=input.nextInt();

    large=a[0][0];

    for(i=0;i<r;i++)

    {

      for(j=0;j<c;j++)

        {

         if(large<a[i][j])

           large=a[i][j];

        }    

    }

  

    System.out.println("The largest element is"+" "+large);

  }

}
