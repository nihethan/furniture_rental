import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SelectRentalFurniture{
    public static String furnitureId;
    static String Choice="";
    static int size=0;
    // public static String brand;
    public static String type="";
   // public BigDecimal dailyRent;
    public static List<String> TypeList=new ArrayList<>();
    // public static List<String> BrandList=new ArrayList<>();
    public static void AvailableFurnitureAndApplianceRental(Scanner sc) {
        System.out.println("Available Furnitures & Appliance For Rent");
           AvailableProduct.List();
        System.out.println("Available Brands ");
        AvailableProduct.Brand();
        AvailableProduct.ComboItems();
    }
    public static int Category(Scanner sc, String choice){
       // System.out.println("Deposite Amount Should 2 times of Rental Products cost .That cost can be fixed Based on your Rental Plans Durations");

        System.out.println("What are the types of "+choice+" you need if no need Please Enter 'end':");
        while(!type.equalsIgnoreCase("end")){
            type=sc.next();
            TypeList.add(type);
        }

            return TypeList.size()-1;

        }


    public static void Rental(Scanner sc) {
        AvailableFurnitureAndApplianceRental(sc);
        System.out.println("Furniture Or Appliance");
        Choice=sc.next();

        System.out.println("Deposite Amount Should 2 times of Rental Products cost .That cost can be fixed Based on your Rental Plans Durations");
        size= SelectRentalFurniture.Category(sc,Choice);
        AddToRentalCart.AddCart(sc,size,Choice);
    }
}


