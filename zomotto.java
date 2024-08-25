import java.util.Scanner;
public class zomotto
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\t\t\t\tWelcome to Zomoto........!");
        Scanner in=new Scanner(System.in);
        System.out.println("Select the Hotel\n1.Bilal\n2.A2B\n3.Amma Canteen\n4.SS Hyderabad\n____________________");
        int hotel=in.nextInt();
        switch (hotel)
        {
            case 1:
            {
                System.out.println("\t\t\t\tGreetings from Bilal........!");
                System.out.println("Select your favourite\n1.Mutton Briyani\n2.Chicken Briyani\n3.Ghee Rice\n____________________");
                int dish=in.nextInt();
                switch (dish)
                {
                    case 1: //Mutton
                    {
                        int a=350;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }
                    }break;
                    case 2: //Chicken
                    {
                        {
                            int a=300;
                            System.out.print("Enter the quantity:");
                            long q=in.nextLong()*a;
                            System.out.println("Total Bill Amount :"+q);
                            System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                            System.out.print("."); Thread.sleep(1000);
                            System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                            int pay=in.nextInt();
                            switch (pay)
                            {
                                case 1:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                case 2:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                default:
                                    System.out.println("Invalid Payment Option Selected");
                            }
                        }
                    }break;
                    case 3: // Ghee rice
                    {
                        int a=270;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }

                    }break;
                    default:
                        System.out.println("Invalid choice for the item");
                }
            }break;

            case 2:
            {
                System.out.println("\t\t\t\tGreetings from A2B........!");
                System.out.println("Select your favourite\n1.A2B-Mutton Briyani\n2.A2B-Chicken Briyani\n3.A2B-Ghee Rice\n____________________");
                int dish=in.nextInt();
                switch (dish)
                {
                    case 1: //Mutton
                    {
                        int a=350;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }
                    }break;
                    case 2: //Chicken
                    {
                        {
                            int a=300;
                            System.out.print("Enter the quantity:");
                            long q=in.nextLong()*a;
                            System.out.println("Total Bill Amount :"+q);
                            System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                            System.out.print("."); Thread.sleep(1000);
                            System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                            int pay=in.nextInt();
                            switch (pay)
                            {
                                case 1:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                case 2:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                default:
                                    System.out.println("Invalid Payment Option Selected");
                            }
                        }
                    }break;
                    case 3: // Ghee rice
                    {
                        int a=270;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }

                    }break;
                    default:
                        System.out.println("Invalid choice for the item");
                }
            }break;

            case 3:
            {
                System.out.println("\t\t\t\tGreetings from AMMA Canteen........!");
                System.out.println("Select your favourite\n1.Idly\n2.Poori\n3.Chapathi\n____________________");
                int dish=in.nextInt();
                switch (dish)
                {
                    case 1: //Mutton
                    {
                        int a=350;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }
                    }break;
                    case 2: //Chicken
                    {
                        {
                            int a=300;
                            System.out.print("Enter the quantity:");
                            long q=in.nextLong()*a;
                            System.out.println("Total Bill Amount :"+q);
                            System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                            System.out.print("."); Thread.sleep(1000);
                            System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                            int pay=in.nextInt();
                            switch (pay)
                            {
                                case 1:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                case 2:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                default:
                                    System.out.println("Invalid Payment Option Selected");
                            }
                        }
                    }break;
                    case 3: // Ghee rice
                    {
                        int a=270;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }

                    }break;
                    default:
                        System.out.println("Invalid choice for the item");
                }
            }break;

            case 4:
            {
                System.out.println("\t\t\t\tGreetings from SS Hyderabad........!");
                System.out.println("Select your favourite\n1.SH-Mutton Briyani\n2.SH-Chicken Briyani\n3.SH-Ghee Rice\n____________________");
                int dish=in.nextInt();
                switch (dish)
                {
                    case 1: //Mutton
                    {
                        int a=350;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }
                    }break;
                    case 2: //Chicken
                    {
                        {
                            int a=300;
                            System.out.print("Enter the quantity:");
                            long q=in.nextLong()*a;
                            System.out.println("Total Bill Amount :"+q);
                            System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                            System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                            System.out.print("."); Thread.sleep(1000);
                            System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                            int pay=in.nextInt();
                            switch (pay)
                            {
                                case 1:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                case 2:
                                {
                                    System.out.print("Enter Bill Amount:");
                                    long bill=in.nextLong();
                                    if (q==bill)
                                    {
                                        System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                        int otp=(int)(Math.random()*9999+9999);
                                        System.out.println(otp);
                                        System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                        int newotp=in.nextInt();
                                        if (otp==newotp)
                                        {
                                            System.out.println("Order Received Succesfully");
                                        }
                                        else
                                            System.out.println("Order Cancelled because of Wrong OTP");
                                    }else
                                        System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                                }break;
                                default:
                                    System.out.println("Invalid Payment Option Selected");
                            }
                        }
                    }break;
                    case 3: // Ghee rice
                    {
                        int a=270;
                        System.out.print("Enter the quantity:");
                        long q=in.nextLong()*a;
                        System.out.println("Total Bill Amount :"+q);
                        System.out.print("Redirecting to Payment Gateway");Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print("."); Thread.sleep(1000);
                        System.out.print(".");Thread.sleep(1000); System.out.print(".");Thread.sleep(1000);
                        System.out.print("."); Thread.sleep(1000);
                        System.out.println("Select the Payment Gateway\n1.Gpay\n2.Phonepe\n____________________");
                        int pay=in.nextInt();
                        switch (pay)
                        {
                            case 1:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            case 2:
                            {
                                System.out.println("Gpay");
                                System.out.print("Enter Bill Amount:");
                                long bill=in.nextLong();
                                if (q==bill)
                                {
                                    System.out.print("Kindly wait for OTP Generation:");Thread.sleep(3000);
                                    int otp=(int)(Math.random()*9999+9999);
                                    System.out.println(otp);
                                    System.out.print("Enter the OTP for confirmation of your order:");Thread.sleep(5000);
                                    int newotp=in.nextInt();
                                    if (otp==newotp)
                                    {
                                        System.out.println("Order Received Succesfully");
                                    }
                                    else
                                        System.out.println("Order Cancelled because of Wrong OTP");
                                }else
                                    System.out.println("Order Failed Because of Wrong Bill Amount is Entered");
                            }break;
                            default:
                                System.out.println("Invalid Payment Option Selected");
                        }

                    }break;
                    default:
                        System.out.println("Invalid choice for the item");
                }
            }break;

            default:
                System.out.println("Invalid Hotel Choosed");
        }
    }
}

