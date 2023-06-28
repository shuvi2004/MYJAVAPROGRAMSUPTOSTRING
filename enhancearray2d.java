public class enhancearray2d
{
    public static void main(String args[])
    {
        int num[][]={{2,3,4,5},{4,5,6,7},{7,8,9,3}};

        for(int a[]:num)
        {
            for(int b:a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
