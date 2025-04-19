import java.util.Scanner;

public class UserRegistrationAndLogin {
    private static  int CIBIL ;
    public static String UserName;
    public static String RegUserName;
    public static String Proof;
    public static String Location;
    public static String PhoneNumber;
    public static String RegPassword;
    public  static String ReSetPassword;
    public static int RegUserId;
    public static String Email;
    public static String Password;
    public static String   ReEnterNewPassword;

    public static boolean Registration(Scanner sc){
        System.out.println("Enter the UserName:");
        UserName=sc.next();
        System.out.println("Enter the location:");
        Location=sc.next();
        if (!Location.equalsIgnoreCase("banglore")) {
            System.out.println("Sorry! We only operate in Banglore.");
            return false;
        }
        System.out.println("Enter your PAN Number:");
        Proof=sc.next();
        System.out.println("Enter the PhoneNumber:");
        PhoneNumber=sc.next();
        if (!Validation.isValidPhoneNumber(String.valueOf(PhoneNumber))) {
            System.out.println("Invalid phone number!");
            return false;
        }
        System.out.println("Enter the Email:");
        Email=sc.next();
        if (!Validation.isValidEmail(Email)) {
            System.out.println("Invalid Email Id!");
            return false;
        }
        System.out.print("Enter your CIBIL Score:");
        CIBIL=sc.nextInt();
        if(!Validation.isValidCIBIL(CIBIL)){
            System.out.println("Your CIBIL Score is not Applicable for Rent products from Us....");
            return false;
        }

        System.out.print("Set a password (Password should contain atleast 1 UpperCase ,1LowerCase ,1 Numeric ,1 Symbol and Password length Minimum 8): ");
        Password = sc.next();

        if (!Validation.isValidPassword(Password)) {
            System.out.println("Password should contain atleast 1 UpperCase ,1LowerCase ,1 Numeric and 1 Symbol and Password length Minimum 8");
            return false;
        }
        return true;

    }

    public static boolean Login(Scanner sc,int UserId) {
        System.out.println("Enter the Registered UserName:");
        RegUserName=sc.next();
        System.out.println("Enter the Your Password Or If you Forget It Give Forget:");
        RegPassword= sc.next();
        if(RegPassword.equalsIgnoreCase("Forget"))
        {
            System.out.println("Enter Your User Id:");
            RegUserId=sc.nextInt();
            if(RegUserId==UserId){
                System.out.println("Enter the New Strong Password:");
                 ReSetPassword=sc.next();
                System.out.println("Confirm Password ReEnter the New Password");
                ReEnterNewPassword = sc.next();
                if (!Validation.isValidPassword(ReSetPassword)) {
                    System.out.println("Password should contain atleast 1 UpperCase ,1LowerCase ,1 Numeric and 1 Symbol and Password length Minimum 8");
                    return false;
                }
                if(!Validation.isValidNewPassword( ReSetPassword,ReEnterNewPassword)){
                    System.out.println("Enter New Password and Conformation PassWord Should be Same ");
                    return false;
                }
                    else
                    Password=ReEnterNewPassword;
                Login(sc,UserId);
            }
            else
            {
                System.out.println("Invalid User Id");
            }

        }
        if((RegUserName.equals(UserName)) && (RegPassword.equals(Password)))
            return true;
        return false;
    }
}
