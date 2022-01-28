import java.util.*;

class Transpose

{

public static void main(String args[])

  {

    int a[][]=new int[30][30];

    int b[][]=new int[30][30];

    int row,col,i,j;

    

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the number of rows and columns");

      

    row=input.nextInt();

    col=input.nextInt();

    System.out.println("enter the matrix elements\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        a[i][j]=input.nextInt();

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        b[i][j]=a[j][i];

    System.out.println("the transpose of the matrix is\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        {

          System.out.printf("%d\t",b[i][j]);

          if(j==col-1)

          System.out.println("\n");

        }

  }

}
