import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AddToRentalCart {
    public static String brand; public static String materialType;
   public static ArrayList<String> cart=new ArrayList<>();
   public static int count;
   public static long id;

   public static String Plan;
    public static void AddCart(Scanner sc, int size, String choice){
      //  System.out.println(size);
        for(int i=0;i<size;i++){
            System.out.println("Which Brand and Material Type you want for "+ SelectRentalFurniture.TypeList.get(i));
            if(choice.equalsIgnoreCase("Appliance")) {
                AvailableProduct.brand2.stream().forEach(n->System.out.print(n+" "));
                System.out.println();
            }
            else
            {
                AvailableProduct.brand.stream().forEach(n->System.out.print(n+" "));
                System.out.println();
            }
            System.out.println("Enter the Brand:");
            brand=sc.next();
            if (SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("bed")){
               Arrays.stream(AvailableProduct.Bed).forEach(n->System.out.print(n+" "));
                System.out.println();}
            else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Wardrobe")){
                Arrays.stream(AvailableProduct.Wardrobe).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("NightStand")){
                Arrays.stream(AvailableProduct.NightStand).forEach(n->System.out.print(n+" "));
                System.out.println();}
          else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("DresserTable")){
                Arrays.stream(AvailableProduct.DresserTable).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Sofa")){
                Arrays.stream(AvailableProduct.Sofa).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("TVStand")){
                Arrays.stream(AvailableProduct.TVStand).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("CoffeeTable")){
                Arrays.stream(AvailableProduct.CoffeeTable).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Chair")){
                Arrays.stream(AvailableProduct.Chair).forEach(n->System.out.print(n+" "));
                System.out.println();}
          else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Desk")){
                Arrays.stream(AvailableProduct.Desk).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Bookshelf")){
                Arrays.stream(AvailableProduct.Bookshelf).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("DiningTable")){
                Arrays.stream(AvailableProduct.DiningTable).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("ChoppingBoard")){
                Arrays.stream(AvailableProduct.ChoppingBoard).forEach(n->System.out.print(n+" "));
                System.out.println();}
          else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Utensils")){
                Arrays.stream(AvailableProduct.Utensils).forEach(n->System.out.print(n+" "));
                System.out.println();}
            else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("Refrigerator")){
                Arrays.stream(AvailableProduct.Refrigerator).forEach(n->System.out.print(n+" "));
                System.out.println();}
            else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("WashingMachine")){
                Arrays.stream(AvailableProduct.WashingMachine).forEach(n->System.out.print(n+" "));
                System.out.println();}
            else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("WaterPurifier")){
                Arrays.stream(AvailableProduct.WaterPurifier).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("TV")){
                Arrays.stream(AvailableProduct.TV).forEach(n->System.out.print(n+" "));
                System.out.println();}
           else if(SelectRentalFurniture.TypeList.get(i).equalsIgnoreCase("ElectricStove")){
                Arrays.stream(AvailableProduct.ElectricStove).forEach(n->System.out.print(n+" "));
                System.out.println();}
            System.out.println("Enter the Material Type:");
            materialType=sc.next();
            System.out.println("How many "+ materialType);
            count=sc.nextInt();
            id=(int)(Math.random() * 10);
            if(count<=10) cart.add(SelectRentalFurniture.TypeList.get(i)+id+" "+materialType+" "+count+" ");
        }
        cart.forEach(n->System.out.print(n+" "));
        System.out.println("Would you like to Continue the Rent the Products(Yes/No)");
        if(sc.next().equalsIgnoreCase("Yes"))
        SelectRentalFurniture.Rental(sc);
        else
        {
          Plan=ChoosePlan(sc);
        if(RentalCheckout.Confirmation(sc,Plan)&&RentalCheckout.TermsAndCondition(sc,Plan)){
            RentalCheckout.Deposit();
            RentalCheckout.PaymentProcess(sc,Plan);
        }
        }

    }

    public static String ChoosePlan(Scanner sc) {
        System.out.println("Choose a plan: 3, 6, 12, 24, 36 months");
        return sc.next();
    }
}
