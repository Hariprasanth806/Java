package Method_App;

import java.util.Scanner;

public class Credentials  {
    static Scanner in = new Scanner(System.in);
    static int sid, pwd;
    static long cnt;
    static boolean singupdone;

    public static void signup() throws Exception{
        if (singupdone)
            System.out.println("Account Exist please do login");
        else {
            System.out.print("Create the Student_id:");
            sid = in.nextInt();
            System.out.print("Create a Password:");
            pwd = in.nextInt();
            System.out.print("Enter the Contact:");
            cnt = in.nextLong();
            System.out.println("Account created");
            singupdone = true;
            Thread.sleep(500);
        }

    }

    public static void login() throws Exception{
        if (doesAccexist()) {
            System.out.print("Enter the Student_id:");
            int lid = in.nextInt();
            System.out.print("Enter the Password:");
            int lpwd = in.nextInt();
            //System.out.print("Enter the Contact:");
            //cnt=in.nextLong();
            if (lid == sid && lpwd == pwd) {
                boolean flag = true;
                do {
                    Thread.sleep(300);
                    System.out.println("1.Number Program\n2.Pattern Program\n3.Exit");
                    int choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            NumberProg.Number();
                            break;
                        case 2:
                            pattern_prog.Pattern();
                            break;
                        case 3:
                            flag=false;
                            break;
                        default:
                            System.out.println("Select correct input");
                    }
                }while (flag);
                System.out.println("Redirecting to Home page");
            }else
                System.out.println("Login failed incorrect Credentials");
        }
        else
            System.out.println("Create & Login to use");
        Thread.sleep(300);
    }

    public static boolean doesAccexist() {
        return singupdone;

    }

    public static void Forget() throws Exception{
        if (doesAccexist()) {

            System.out.print("Enter your contact:");
            long fcnt = in.nextLong();
            if (fcnt == cnt) {
                System.out.print("The generated otp is:");
                int otp = (int) (Math.random() * 9999 + 9999);
                System.out.println(otp);
                System.out.print("Enter the otp:");
                int newotp = in.nextInt();
                if (otp == newotp) {
                    System.out.print("Create new Student ID:");
                    sid = in.nextInt();
                    System.out.print("Create new Password:");
                    pwd = in.nextInt();
                    System.out.print("Enter the Contact:");
                    cnt = in.nextLong();
                    System.out.println("Credentials Changed login again");
                    Thread.sleep(300);
                } else
                    System.out.println("Enter the Correct OTP to reset password");
            } else
                System.out.println("Invalid mobile number");
        }
        else
            System.out.println("Create an account ");

    }
}
