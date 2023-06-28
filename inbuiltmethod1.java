public class inbuiltmethod1 
{
    public static void main(String args[])
    {
        StringBuffer s1=new StringBuffer();
        System.out.println(s1.capacity());
        s1.append("ahhdhgjhgvehmuii");
        System.out.println(s1.capacity());
        s1.append("a");
        System.out.println(s1.capacity());
        System.out.println(s1.length());

        StringBuffer s2=new StringBuffer("Sachin");
        System.out.println(s2.capacity());
        s2.setCharAt(1, 's');
        System.out.println(s2);


        StringBuffer s3=new StringBuffer(150);
        System.out.println(s3.capacity());
        s3.append("java");
        System.out.println(s3.capacity());
        s3.trimToSize();
        System.out.println(s3.capacity());

        StringBuffer s4=new StringBuffer("pw java");
        System.out.println(s4.reverse());
    }
}
