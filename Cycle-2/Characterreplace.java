import java.util.*;

class Characterreplace

{

    public static void main(String args[])

    {

        Scanner input=new Scanner(System.in);

        System.out.println("enter a string");

        String s=input.nextLine();

        System.out.println("enter the character to be removed and the position of the character in the string");

        char rem=input.next().charAt(0);

        int pos=input.nextInt();

        System.out.println("enter the character to be replaced");

        char rep=input.next().charAt(0);

        System.out.print("the new string is ");

        System.out.println("'"+s.substring(0,pos-1)+rep+s.substring(pos)+"'");

    }

}
