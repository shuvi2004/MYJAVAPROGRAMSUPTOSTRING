public class stringtype
{
    public static void main(String args[])
    {
        String brand="pwskills";
        System.out.println(brand);
        brand.concat("bengaluru");  //immutable string (can't be changed)
        System.out.println(brand);

        StringBuffer brand1=new StringBuffer("pwskills");
        System.out.println(brand1);
        brand1.append("bengaluru"); //mutable string (changed)
        System.out.println(brand1);


    }
}
