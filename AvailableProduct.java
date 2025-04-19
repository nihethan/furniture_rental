import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AvailableProduct {
    public static String[] Bed={"King", "Queen", "Single"};
    public static String[] Wardrobe={"Wood", "Metal", "Plastic"};
    public static String[] NightStand={"Wood", "Glass", "Plastic"};
    public static String[] DresserTable={"Wood", "Metal", "Plastic"};
    public static String[] Sofa = {"Leather", "Fabric", "Recliner"};
    public static String[] TVStand = {"32in", "43in", "55in"};
    public static String[]  CoffeeTable= {"Wood", "Glass", "Metal"};
    public static String[] Chair = {"Wood", "Metal", "Glass"};
    public static String[] Desk= {"Wood", "Metal", "Plastic"};
    public static String[] Bookshelf = {"Wood", "Glass", "Metal"};
    public static String[] DiningTable = {"Wood", "Plastic", "Bamboo"};
    public static String[] ChoppingBoard ={"Wood", "Plastic", "Bamboo"};
    public static String[] Utensils={"KnifeStand", "SpoonStand", "PlateStand"};
    public static String[] Refrigerator = {"Single", "Double", "SideBySide"};
    public static String[] WashingMachine= {"TopLoad", "FrontLoad"};
    public static String[] WaterPurifier = {"RO", "UV", "UF"};
    public static String[] TV = {"32", "43", "55"};
    public static String[] ElectricStove = {"Induction", "Gas"};
    public static String[] combo1 = {"Refrigerator", "WashingMachine", "Bed", "Chair"};
    public static String[] combo2 = {"Refrigerator", "Sofa", "TV", "ElectricStove"};
    public static List<String> list=List.of("Bed","Wardrobe","NightStand","DresserTable","Sofa","TVStand","CoffeeTable","Chair","Desk","Bookshelf","DiningTable","ChoppingBoard","Utensils");
    public static  List<String> list2=List.of("Refrigerator","WashingMachine","WaterPurifier","TV","ElectricStove");
public static   List<String> brand=List.of("IKEA","WoodenStreet","HomeTown","Godrej","Interio","Durian","Nilkamal","Natuzzi","Stanle");
public static  List<String> brand2=List.of("Bosch","Frigidaire", "GE", "KitchenAid", "LG", "Maytag","Samsung", "Speed Queen");
    public static void List() {


        System.out.println("Furniture List "); System.out.println();
        list.stream().forEach(n->System.out.print(n+" ")); System.out.println();

        System.out.println("----Furniture Items|Material Types----");
        System.out.print("Bed:"); Arrays.stream(Bed).forEach(n->System.out.print(n+" "));
        System.out.println();
        System.out.print("Wardrobe:");Arrays.stream(Wardrobe).forEach(n->System.out.print(n+" "));
        System.out.println();System.out.print("Wardrobe:");
        Arrays.stream(NightStand).forEach(n->System.out.print(n+" "));
        System.out.println();System.out.print("DresserTable:");
        Arrays.stream(DresserTable).forEach(n->System.out.print(n+" "));
        System.out.println();System.out.print("Sofa:");
        Arrays.stream(Sofa).forEach(n->System.out.print(n+" "));
        System.out.println();System.out.print("TVStand:");
        Arrays.stream(TVStand).forEach(n->System.out.print(n+" "));
        System.out.println();System.out.print("CoffeeTable:");
        Arrays.stream(CoffeeTable).forEach(n->System.out.print(n+" "));    System.out.println();System.out.print("Chair:");
        Arrays.stream(Chair).forEach(n->System.out.print(n+" "));    System.out.println(); System.out.print("Desk:");
        Arrays.stream(Desk).forEach(n->System.out.print(n+" "));    System.out.println();System.out.print("Bookshelf:");
        Arrays.stream(Bookshelf).forEach(n->System.out.print(n+" "));    System.out.println(); System.out.print("DinningTable:");
        Arrays.stream(DiningTable).forEach(n->System.out.print(n+" "));    System.out.println();System.out.print("ChoppingBoard:");
        Arrays.stream(ChoppingBoard).forEach(n->System.out.print(n+" "));    System.out.println();System.out.print("Utensils:");
        Arrays.stream(Utensils).forEach(n->System.out.print(n+" "));    System.out.println();

        System.out.println("----Appliance List----");
        list2.stream().forEach(n->System.out.print(n+" "));    System.out.println();

        System.out.println("----Appliance Items|Material Types----");
        System.out.println();System.out.print("Refrigerator:");
        Arrays.stream(Refrigerator).forEach(n->System.out.print(n+" "));    System.out.println();System.out.print("WashingMachine:");
        Arrays.stream(WashingMachine).forEach(n->System.out.print(n+" "));   System.out.println();System.out.print("WaterPurifier:");
        Arrays.stream(WaterPurifier).forEach(n->System.out.print(n+" "));   System.out.println();System.out.print("TV:");
        Arrays.stream(TV).forEach(n->System.out.print(n+" "));  System.out.println();System.out.print("ElectricStove:");
        Arrays.stream(ElectricStove).forEach(n->System.out.print(n+" "));    System.out.println();System.out.println();
    }

    public static void Category(Scanner sc, String type,String brand) {

    }

    public static void Brand() {

        System.out.println("Furniture Brands");
        brand.stream().forEach(n->System.out.print(n+" "));
        System.out.println();

        System.out.println("Appliance Brand");
        brand2.stream().forEach(n->System.out.print(n+" "));
        System.out.println();
    }

    public static void ComboItems() {

        System.out.println("Available combos: combo1, combo2");
        System.out.print("Combo1:");
       Arrays.stream(combo1).forEach(n->System.out.print(n+" "));
        System.out.println();
        System.out.print("Combo2:");
       Arrays.stream(combo2).forEach(n->System.out.print(n+" "));
        System.out.println();
    }
}
