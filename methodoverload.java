class Clac
{
    public int add(int n1,int n2)
    {
        int result=n1+n2;
        return result;
    }
    public int add(int n1,int n2,int n3)
    {
        int result=n1+n2+n3;
        return result;
    }
    public double add(double n1,double n2 )
    {
         double result=n1+n2;
        return result;
    }

}

public class methodoverload
{
    public static void main(String args[])
    {
        Calc obj1 = new Calc();
        int result=obj1.add(4,3);
        int res=obj1.add(4,3,3);
        double res1=obj1.add(4.5,3.6);
        
        System.out.println(result);
        System.out.println(res);
        System.out.println(res1);
        
    }
}
