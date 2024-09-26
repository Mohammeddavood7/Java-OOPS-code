package dec_18;

import java.util.Scanner;

public class WholeSellerBillCounter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amt = Double.parseDouble(obj.nextLine());
        if (amt < 5000) {
            double bill = amt * 5.0 / 100;
            double payable = amt - bill;
            System.out.println("Discount : 5% " + "\n" + "Total Amount: " + amt + "\n" + "Payable Amount: " + payable);
        } else if (amt >= 5000 && amt <= 10000) {
            double bill = amt * 10.0 / 100;
            double payable = amt - bill;
            System.out.println("Discount : 10% " + "\n" + "Total Amount: " + amt + "\n" + "Payable Amount: " + payable);
        } else if (amt > 10000) {
            double bill = amt * 15.0 / 100;
            double payable = amt - bill;
            System.out.println("Discount : 15% " + "\n" + "Total Amount: " + amt + "\n" + "Payable Amount: " + payable);
        }
    }

}