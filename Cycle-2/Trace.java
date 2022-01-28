import java.util.*;

class Trace

{

public static void main(String args[])

  {

    int a[][]=new int[30][30];

    

    int row,i,j,s=0;

    

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the number of rows and colums of a square matrix");

      

    row=input.nextInt();

    

    System.out.println("enter the square matrix");

    for(i=0;i<row;i++)

      for(j=0;j<row;j++)

        a[i][j]=input.nextInt();

    for(i=0;i<row;i++)

      s=s+a[i][i];

    System.out.println("the trace of the matrix is"+" "+s);

  }

}
