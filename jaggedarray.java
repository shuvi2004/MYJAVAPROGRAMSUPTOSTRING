public class jaggedarray 
{
    public static void main(String args[])
    {
        // int num[][]={{5,2,5,6},{4,2},{4,5,3}};
        int num[][]=new int[3][];
        num[0]=new int[4];
        num[1]=new int[2];
        num[2]=new int[3];

        num[0][0]=4;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
