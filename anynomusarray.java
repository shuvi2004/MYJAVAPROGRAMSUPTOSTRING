class calc
{
    public int add(int arr[])
    {
        int result=0;
        for(int n:arr)
        {
            result=result+n;
        }
        return result;
    }
}
public class anynomusarray 
{
    public static void main(String args[])
    {
        calc obj=new calc();
        int result=obj.add(new int[]{5,3,4,7});
        System.out.println(result);

    }
}
