public class array1D 
{
    public static void main(String args[])
    {
        // int a[]={2,5,8,10};   //if you know this no.
        // for(int i=0;i<4;i++)
        // {
            // System.out.println(a[i]);
        // }

        int num[]=new int[4];
        num[1]=6;
        num[0]=43;   //if you don't know this.
        num[2]=98;
        for(int i=0;i<4;i++)
        {
            System.out.println(num[i]);
        }
    }
}
