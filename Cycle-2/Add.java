import java.util.*;

class Add

{

public static void main(String args[])

  {

    int a[][]=new int[30][30];

    int b[][]=new int[30][30];

    int c[][]=new int[30][30];

    int row,col,i,j;

    

    Scanner input=new Scanner(System.in);

    System.out.println("Enter the number of rows and columns");

      

    row=input.nextInt();

    col=input.nextInt();

    System.out.println("enter the first matrix\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        a[i][j]=input.nextInt();

       

    System.out.println("enter the second matrix\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        b[i][j]=input.nextInt();

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        c[i][j]=a[i][j]+b[i][j];

    System.out.println("the sum of the 2 matrix is\n");

    for(i=0;i<row;i++)

      for(j=0;j<col;j++)

        {

          System.out.printf("%d\t",c[i][j]);

          if(j==col-1)

          System.out.println("\n");

        }

  }

}
