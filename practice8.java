//wap delete all consonants from the string "Hello,have a good day"(user input)
import java.util.Scanner;
public class practice8
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s2=s1.nextLine();
        System.out.print("After removing consonant:");
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u'||s2.charAt(i)=='A'||s2.charAt(i)=='E'||s2.charAt(i)=='I'||s2.charAt(i)=='O'||s2.charAt(i)=='U')
            {
                continue;
            }
            else
            {
                System.out.print(s2.charAt(i));
            }
        }

    }
}
