class demo
{
    public void show(byte n)
    {
        System.out.println("byte" +n);
    }
    public void show(short n)
    {
        System.out.println("short" +n);
    }
    public void show(int n)
    {
        System.out.println("int" +n);
    }
    public void show(long n)
    {
        System.out.println("long" +n);
    }
    public void show(float n)
    {
        System.out.println("float" +n);
    }
    public void show(double n)
    {
        System.out.println("double" +n);
    }
    public void show(char n)
    {
        System.out.println("char" +n);
    }

}


public class aoverload
 {
    public static void main(String args[])
    {
        demo obj1 =new demo();
        // byte b=2;
        obj1.show('n');
    }
} 
