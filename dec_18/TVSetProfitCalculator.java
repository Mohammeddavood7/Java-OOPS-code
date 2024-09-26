package dec_18;
import java.util.Scanner;

public class TVSetProfitCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the costprice of tv");
        Scanner obj = new Scanner(System.in);
        double cp = Double.parseDouble(obj.nextLine());
        double pt = cp * 27.00 / 100;
        double vt = (cp + pt) * 12.70 / 100;
        double sc = (cp + pt) * 3.87 / 100;
        double total = cp + pt + vt + sc;
        System.out.println("Cost Price:Rs. " + cp + "\n" + "Profit: " + pt + "\n" + "VAT: " + vt + "\n"
                + "Service Charge: " + sc + "\n" + "Total Selling Price: " + total);
    }

}
