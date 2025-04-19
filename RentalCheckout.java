import java.time.LocalDate;
import java.util.Scanner;

public class RentalCheckout {
    public static boolean Confirmation(Scanner sc,String Plan) {
        System.out.println("Plan: " +Plan+" Months (True/False)");
        return sc.nextBoolean();
    }

    public static void Deposit() {
        System.out.println("Deposite Amount Should 2 times of Rental Products cost .That cost can be fixed Based on your Rental Plans Durations");
    }

    public static void PaymentProcess(Scanner sc, String plan) {
        LocalDate startDate = LocalDate.now();
        System.out.println("Rental Date"+startDate);
        LocalDate dueDate = startDate.plusMonths(Long.parseLong(plan));
        System.out.println("Rented successfully! Your due date for payment is: " + dueDate);
        System.out.print("Do you want to enable auto deduction if overdue? (yes/no): ");
        String autoDeductionChoice = sc.next();
        boolean autoDeductionEnabled = autoDeductionChoice.equalsIgnoreCase("yes");
        if (autoDeductionEnabled) {
            System.out.println("Auto deduction enabled. Amount will be deduct for extra  month's of usage.");
        } else {
            System.out.println("Auto deduction not enabled. If DueDate over, The ExtraMonth Penalty of 1 Month amount + Extra Used Month Rent will be deducted for late payment.");
        }
    }

    public static boolean TermsAndCondition(Scanner sc, String plan) {
        System.out.println("--- Terms and Conditions ---");
        System.out.println("* Proofs were Collected Under the KYC Policy");
        System.out.println("* User should have minimum 550 Cibil Score to take our Rental Products");
        System.out.println("* Only Banglore delivery allowed");
        System.out.println("* Early return may incur penalty");
        System.out.println("* Subscription required for extension");
        System.out.println("* In Bengaluru, a security deposit for renting a property typically ranges from one to six months' rent, with common practice being around two to three months' rent This will be Return to you while Return Rental product to us without any damage");
        System.out.println("* If any Damage is Detucted during Verification the Damage amount will be deducted from your Deposit amount. ");
        System.out.print("Agree to terms? (Yes/No): ");
        if(sc.next().equalsIgnoreCase("yes"))
            return true;
        return false;

    }
}
