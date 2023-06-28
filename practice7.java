//write a programm to check if the letter e present in the world umbrella.
public class practice7 
{
    public static void main(String args[])
    {
        StringBuffer s1=new StringBuffer();
        s1.append("Umbrella");
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='e')
            {
                c++;
            }
            else
            {
                continue;
            }
        }
        System.out.print("The no of 'e' letter in present umbrella is: ");
        System.out.print(c);
    }
    
}
