public class Test
{
    int a; //instance variable(heap area)
    
    public static void main(String args[])
    {
        int num=9;
        Test obj1=new Test();
        Test obj2=new Test(); //local variable(stack area)
        obj1.a=77;
        // System.out.println(obj1.name);
        System.out.println(obj1.a);      
        // System.out.println(obj2.name);
        System.out.println(obj2.a);
        System.out.println(num);
        
        
        
        
    }
}