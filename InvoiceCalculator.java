public class InvoiceCalculator {
    public static void main(String[] args) {
        String customer = "Tanisha";
        int items = 3;
        double pricePerItem = 19.99;
        double subtotal = items * pricePerItem;
        double tax = subtotal * 0.07;
        double total = subtotal + tax;

        System.out.println("Invoice for: " + customer);
        System.out.println("Items: " + items);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
