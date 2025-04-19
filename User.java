import java.util.*;
public class User {
    public static void main(String[] args) {
        long randomNum = 0;
        String NextStep="";

        Scanner sc=new Scanner(System.in);
          UserRegistrationAndLogin useregistrationAndLogin=new UserRegistrationAndLogin();
        System.out.println("-----Welcome to Our Rental Page-----");
        System.out.println("-----Registration----");
        if(UserRegistrationAndLogin.Registration(sc))
        {
             randomNum = (int)(Math.random() * 10000);

            System.out.println("User ID:"+randomNum);
            System.out.println("Registration SuccessFull");
            System.out.println("Like Login now");
            NextStep=sc.next();

        }
        else
            System.out.println("Give Valid Data");

        if(NextStep.equalsIgnoreCase("yes")) {
            System.out.println("----Login----");
            if (UserRegistrationAndLogin.Login(sc, (int) randomNum)) {
                System.out.println("Login SuccessFully");
                System.out.println("Would You Like To Take Rental Or Renturn Products Now");
                if (sc.next().equalsIgnoreCase("yes")) {
                    System.out.println("Rental Or Return");
                    String UserChoice = sc.next();
                    if (UserChoice.equalsIgnoreCase("Rental")) {
                        SelectRentalFurniture.Rental(sc);

//                        SelectRentalFurniture.AvailableFurnitureAndApplianceRental(sc);
//                        System.out.println("Furniture Or Appliance");
//                        Choice=sc.next();
//
//                        System.out.println("Deposite Amount Should 2 times of Rental Products cost .That cost can be fixed Based on your Rental Plans Durations");
//                       size= SelectRentalFurniture.Category(sc,Choice);
//                        AddToRentalCart.AddCart(sc,size,Choice);
                    } else {

                    }
                }
            } else
                System.out.println("Invalid UserName or Password|| Login not Done Sucessfully");


        }
        else
            System.out.println("Thanks for Visiting Us");
    }
}