//write a java programm to calculate the sum of an inreger array
public class practice3
 
{
    public int add(int arr[])
    {
        int res=0;
        for(int n:arr)
        {
            res=res+n;
        }
        return res;
    }
    public static void main(String args[])
    {
       practice3 obj=new practice3();
       int nums[]={3,4,5,6,7};
       int result=obj.add(nums);
       System.out.println(result);
    }
}
