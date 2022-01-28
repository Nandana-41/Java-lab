import java.util.*;

class Frequency

{

    public static void main(String args[])

    {

        Scanner input=new Scanner(System.in);

        System.out.println("enter a string");

        String s=input.nextLine();

        System.out.println("enter a character");

        char c=input.next().charAt(0);

        int a=0;

        

        

        for(int i=0;i<s.length();i++)

        {

            if(s.charAt(i)==c)

                a++;

        }

        

        

        System.out.println("the frequency of the given character in the string is "+" "+a);

    }

}
