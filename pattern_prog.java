package Method_App;
import java.util.Scanner;
public class pattern_prog
{
    static Scanner in=new Scanner(System.in);
    public static void Square()throws Exception {
        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
               // if (i==0||j==0||i==n-1||j==n-1)
                    System.out.print("*  ");Thread.sleep(300);
               // else
                    //System.out.print("   ");
            }
            System.out.println();
        }
        Thread.sleep(500);
    }
    public static void Star() throws Exception{
        int n=7;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==j||i==n/2||j==n/2||i+j==n-1){
                    System.out.print("* ");
                    Thread.sleep(300);
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }Thread.sleep(500);
    }
    public static void Pattern() throws Exception
    {
        boolean flag=true;
        while (flag)
        {
        System.out.println("1.Square\n2.Star\n3.Exit");
        int choice= in.nextInt();
        switch (choice)
            {
            case 1:
                Square();
                break;
            case 2:
                Star();
                break;
            case 3:
                flag=false;
                break;
                default:
                    System.out.println("\t\t\t\t\t\tSelect correct input");
            }Thread.sleep(500);

        }
        System.out.println("Redirecting to Program selection page");
    }
}
