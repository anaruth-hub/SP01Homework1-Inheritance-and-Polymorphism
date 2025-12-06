package sprint01.Exceptions01.level01A;

public class MainExceptions01 {
    public static void main(String[] args) {

        Sale emptySale = new Sale();
        calculateAndPrint(emptySale, "Empty sale");

        Sale saleWithProducts = createModelSale();
        calculateAndPrint(saleWithProducts, "Sale with products");

        attempIndexOutOfBounds();

        System.out.println("The program has finished successfully");
    }

    private static Sale createModelSale() {
        Sale sale = new Sale();
        sale.addProduct(new Product("meat", 3.00));
        sale.addProduct(new Product("milk", 1.20));
        sale.addProduct(new Product("Soda", 0.70));
        return sale;

    }

    private static void calculateAndPrint(Sale sale, String description) {
        try {
            sale.calculateTotal();
            System.out.println(description + "→ Total: " + sale.getTotal() + " €");
        } catch (EmptySaleException e) {
            System.out.println(description + "→ " + e.getMessage());
        }
    }

    private static void attempIndexOutOfBounds() {
        try {
            int[] numbers = {10, 20, 30};
            int value = numbers[5];
            System.out.println("The value is in the position 5 " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index error: You have attempted to access an invalid position");
            System.out.println("Technical details: " + e.getMessage());
        }
    }
}
