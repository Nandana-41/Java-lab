import java.util.*;

class Multiply

{

public static void main(String args[])

  {

    int a[][]=new int[30][30];

    int b[][]=new int[30][30];

    int c[][]=new int[30][30];

    int row,col,col1,i,k,j;

    

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the number of rows and columns of the first matrix");

      

    row=input.nextInt();

    col=input.nextInt();

    System.out.println("enter the number of columns of second matrix");

    col1=input.nextInt();

      

    System.out.println("enter the first matrix\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        a[i][j]=input.nextInt();

       

    System.out.println("enter the second matrix\n");

    for(i=0;i<col;i++)

      for(j=0;j<col1;j++)

        b[i][j]=input.nextInt();

    for(i=0;i<row;i++)

      for(j=0;j<col1;j++)

        for(k=0;k<col;k++)

        c[i][j]=c[i][j]+(a[i][k]*b[k][j]);

    System.out.println("the product of the 2 matrix is\n");

    for(i=0;i<row;i++)

      for(j=0;j<col1;j++)

        {

          System.out.printf("%d\t",c[i][j]);

          if(j==col1-1)

          System.out.println("\n");

        }

  }

}
