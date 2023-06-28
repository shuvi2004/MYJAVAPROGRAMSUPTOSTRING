public class nestedifelse
 {
    public static void main(String args[])
    {
        int age=1;
        if(age>=18 && age<=60)
        {
            if(age>=20 && age<=29)
            {
                System.out.println("You are in 20's");
            }
            else if(age>=30 && age<=39)
            {
                System.out.println("You are in 30's");
            }
            else
            {
                System.out.println("You are not in 20's and 30's");
            }
        }
        else if(age>=60)
        {
            System.out.println("You are old man");
        }
        else if(age<=0)
        {
            System.out.println("the age is invalid");
        }
        else
        {
            System.out.println("You are Kid");
        }
       
}
}
