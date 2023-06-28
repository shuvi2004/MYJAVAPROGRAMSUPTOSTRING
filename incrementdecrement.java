public class incrementdecrement
 {
    public static void main(String args[])
    {
        // int s=7;
        // int b=s++;  outpuut:7 (post increment)
        // int b=++s;  output:8   (pre increment)
        // int k=8;
        // int c=k--;   output:8  (post decrement)
        // int c=--k;   output=7   (pre decrement)

        // System.out.println(b);
        // System.out.println(c);

        // ---------------------------------------------------------------------

        int a=5;
        int b=a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);
        

    }
}
