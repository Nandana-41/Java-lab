import java.util.*;
class Reverse{
	public static void main(String[] args)
    {
        Scanner myWord = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = myWord.nextLine();
        int c= word.length();
        
        Reverse f = new Reverse();
        f.freq(c,word);
        f.rev(c,word);
    }
    void freq( int c, String word)
    {
        Scanner myWord = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the character whose frequency to be measured : ");
        char character = myWord.next().charAt(0);
        for(int i=0; i<c ; i++)
            if(character == word.charAt(i))
                count++;
        System.out.println("Frequency of "+character+" is : " +count);
    }
    void rev( int c, String word)
    {
    char x;
    String rvsd="";
    for(int i=c-1;i>=0;i--)
        {
        x=word.charAt(i);
        rvsd+=x;
        }
    System.out.println("Reversed String is : " +rvsd);
    }
}
