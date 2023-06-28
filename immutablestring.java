public class immutablestring
{
    public static void main(String args[])
    {
        String s1="pwskills";
        String s2="pwskills";
        System.out.println(s1==s2); //dublicate not allowed (refer 1 object)

        String s3=new String("pwskills");
        String s4=new String("pwskills");
        System.out.println(s3==s4);  //dublicate allowed (refer different object)

        
    }
    
}
