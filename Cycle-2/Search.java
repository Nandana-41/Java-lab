import java.util.*;

class Search

{

    public static void main(String args[])

    {

        Scanner input=new Scanner(System.in);

        

        System.out.println("enter a string");

        String s=input.nextLine();

        

        System.out.println("enter the character to be found");

        char c=input.next().charAt(0);

        

        for(int i=0;i<s.length();i++)

        {

            if(s.charAt(i)==c)

                System.out.println("the given character is found at position "+(i+1));

        }

        

        

        

    }

}
