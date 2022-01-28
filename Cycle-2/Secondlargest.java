class Secondlargest

{

public static void main(String args[])

  {

    int a[]=new int[30];

    int n,i,large1,large2=0;

    Scanner input=new Scanner(System.in);

    System.out.println("How many elements?");

    n=input.nextInt();

    System.out.println("Enter the elements");

    

    for(i=0;i<n;i++)

      a[i]=input.nextInt();

    large1=a[0];

    for(i=1;i<n;i++)

      if(a[i]>large1)

        large1=a[i];

    

    for(i=0;i<n;i++)

      if((a[i]!=large1) && (a[i]!=0))

        {

          large2=a[i];

          break;

        }

    for(i=0;i<n;i++)

      if((a[i]!=large1) && (a[i]!=large2))

        if(a[i]>large2)

          large2=a[i];

    System.out.println("The second largest element is"+" "+large2);

   }

}      
