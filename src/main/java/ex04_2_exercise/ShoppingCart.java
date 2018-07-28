package ex04_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName + " wants to purchase a " + itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 79.90;
        double tax = 3.2;
        int quantity = 10;  

        // Modify message to include quantity 
        message = custName + " wants to purchase a " + quantity + " " + itemDesc;

        System.out.println(message);

        // Calculate total and then print the total cost
        System.out.println("Total cost with tax is: " + (price*tax*quantity));

    }
}
