public class comparestring 
{
    public static void main(String args[])
    {
        String s1="pwskills";
        String s2=new String("pwskills");

        System.out.println(s1==s2); //check referance. false
        System.out.println(s1.equals(s2)); //check content. true


        // -----------------------------------------


        String s3="pwskill";
        String s4="pwskill";
        System.out.println(s3==s4); //check referance. true
        System.out.println(s3.equals(s4)); //check content. true

        // ----------------

        String s5=new String("pwskill");
        String s6=new String("pwskill");
        System.out.println(s5==s6); //false
        System.out.println(s5.equals(s6)); //true

        // ----------------------

        String a1="shuvi";
        String a2=new String("SHUvi");
        String a3="shuvi";
        System.out.println(a1==a3);
        System.out.println(a1==a2);
        System.out.println(a1.equalsIgnoreCase(a2)); //this is ignoreing upper and lower case
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a2));

    }
}
