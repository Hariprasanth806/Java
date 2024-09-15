package Method_App;
import java.util.Scanner;
public class NumberProg
{
    static  Scanner in=new Scanner(System.in);
    static int n, fact=1;
    public static void fact()
    {
        System.out.print("Enter the number to get factorial:");
        n=in.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }

    public static void prime()
    {
        System.out.print("Enter the number to check it is prime or not a prime number:");
        n= in.nextInt();int primefact=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0) {
               primefact ++;}
        }
        if (primefact==2)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");

    }

    public static void Number() {
        boolean flag=true;
        do {
            System.out.println("1.Factorial\n2.Prime number\n3.Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    fact();
                    break;
                case 2:
                    prime();
                    break;
                case 3:
                    flag=false;
                    break;
                    default:
                        System.out.println("\t\t\t\tSelect correct input");
            }
        }while (flag);

    }
}
