import java.util.*;

class String

{

    public static void main(String args[])

    {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string");

        String s=input.nextLine();

        

        int i=0,j=s.length()-1,check=1;

        

        while(i<j)

        {

            if(s.charAt(i)!=s.charAt(j))

            {

                check=0;

                break;

            }

            i++;

            j--;

            

        }

         if(check==1)

             System.out.println("the given string is a pallindrome");

         else

             System.out.println("the given string is not a pallindrome");

    

    

    }

}
