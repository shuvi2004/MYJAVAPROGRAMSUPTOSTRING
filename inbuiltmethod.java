public class inbuiltmethod 
{
    public static void main(String args[])
    {
        String s1="pw skill java";
        
        String s2=s1.toUpperCase();
        System.out.println(s2);

        String s3=s1.toLowerCase();
        System.out.println(s3);

        int s4=s1.length();
        System.out.println(s4);

        char s5=s1.charAt(3);
        System.out.println(s5);

        String s6=s1.substring(3, 8);
        System.out.println(s6);

        int s7=s1.indexOf("l");
        System.out.println(s7);

        int s8=s1.lastIndexOf("l");
        System.out.println(s8);

        String s9=s1.replace("p", "s");
        System.out.println(s9);

        


    }
}
