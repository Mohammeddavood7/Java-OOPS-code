package Com.feb1.test;

public class ShoppingCart {

    // Calculate total without discounts
    public double calculateTotal() {
        // Logic to calculate total without any discounts
        return 0.0; // Placeholder return value
    }

    // Calculate total with percentage discount
    public double calculateTotal(double totalCost, double percentageDiscount) {
        // Apply percentage discount to the total cost
        double discountedAmount = totalCost - (totalCost * (percentageDiscount / 100));
        return discountedAmount;
    }

    // Calculate total with fixed amount discount
    public double calculateTotal(double totalCost, double fixedDiscountAmount) {
        // Apply fixed amount discount to the total cost
        double discountedAmount = totalCost - fixedDiscountAmount;
        return discountedAmount;
    }

    // Example usage in main method
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Example: Calculate total without discounts
        double total1 = cart.calculateTotal();
        System.out.println("Total without discounts: " + total1);

        // Example: Calculate total with percentage discount
        double total2 = cart.calculateTotal(100.0, 10.0); // Total cost: $100, 10% discount
        System.out.println("Total with percentage discount: " + total2);

        // Example: Calculate total with fixed amount discount
        double total3 = cart.calculateTotal(100.0, 20.0); // Total cost: $100, $20 discount
        System.out.println("Total with fixed amount discount: " + total3);
    }
}
