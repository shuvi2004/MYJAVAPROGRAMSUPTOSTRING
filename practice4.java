//wap to find the index a specific element of an integer array.
public class practice4 
{
    public static void main(String args[])
    {
        
        int arr[]={3,7,8,9};
        int target=9;
        for(int i=0;i<4;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i);
                break;
            }
            else
            {
                System.out.println("not found");
            }

        }

    }

}
