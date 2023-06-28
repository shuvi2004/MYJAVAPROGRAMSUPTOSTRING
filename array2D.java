public class array2D
{
    public static void main(String args[])
    {
        // int a[][]=new int[3][2];
        // a[0][0]=5;
        // a[0][1]=4;
        // a[1][0]=6;
        // a[1][1]=7;
        // a[2][0]=1;
        // a[2][1]=7;
        int a[][]={{5,4},{6,7},{1,7}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
