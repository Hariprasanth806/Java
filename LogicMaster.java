package Method_App;
import java.util.Scanner;
public class LogicMaster {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)throws Exception {
       boolean flag=true;
       while (flag)
       {
            System.out.println("\t\t\t\t<<--Welcome to LogicMaster Application-->");
            System.out.println("1.Signup\n2.Login\n3.Forget Password\n4.Exit");
            int abc = in.nextInt();
            switch (abc)
            {
                case 1:
                    Credentials.signup();Thread.sleep(300);
                    break;
                case 2:
                    Credentials.login();Thread.sleep(300);
                    break;
                case 3:
                    Credentials.Forget();Thread.sleep(300);
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("\t\t\t\tSelect the correct Input");
            }
       }System.out.println("Thank You");
    }
}

