//wap to demonastrate method overloading with different parameter.

public class practice1  
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
    public double add(double n1,double n2)
    {
        double result=n1+n2;
        return result;
    }
    public static void main(String args[])
    {
        practice1 sum1=new practice1();
        practice1 sum2=new practice1();
        practice1 sum3=new practice1();

        int res1=sum1.add(2,3);
        int res2=sum2.add(4,5,6);
        double res3=sum3.add(2.8f,3.7f);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        
    }
    
}
