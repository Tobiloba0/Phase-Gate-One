import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("Welcome to Tobiloba Online Store");

        while (true) {  // menu loop
            System.out.print(display());
            int choice = input.nextInt();
            input.nextLine(); // clear leftover newline

            if (choice == 1) {
                // ADD ITEMS
                while (true) {
                    System.out.print("Enter product name or type 'done' to finish: ");
                    String name = input.nextLine();

                    if (name.equalsIgnoreCase("done")) {
                        break;   // stop adding items
                    }

                    products.add(name);

                    System.out.print("Enter price: ");
                    if (input.hasNextDouble()) {
                        double price = input.nextDouble();
                        prices.add(price);
                        input.nextLine(); 
                    } else {
                        System.out.println("Invalid price!");
                        input.nextLine();
                    }
                }

            } else if (choice == 2) {
                // REMOVE ITEM
                System.out.print("Enter product name to remove: ");
                String removeItem = input.nextLine();

                if (products.contains(removeItem)) {
                    int index = products.indexOf(removeItem);
                    products.remove(index);
                    prices.remove(index);
                    System.out.println("Removed successfully!");
                } else {
                    System.out.println("Item not found.");
                }

            } else if (choice == 3) {
                // SHOW ITEMS
                if (products.isEmpty()) {
                    System.out.println("No items available.");
                } else {
                    System.out.println("\nAvailable Items:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i) + " - ₦" + prices.get(i));
                    }
                }

            } else if (choice == 4) {
                // QUIT
                System.out.println("Thank you for using Tobiloba Online Store. Goodbye!");
                break;  // exit the while loop

            } else {
                System.out.println("Invalid option. Try again.");
            }

            System.out.println(); // space for readability
        }
    }

    public static String display() {
        return """
        Select from the options below:
        1. Add items
        2. Remove items
        3. Show all items
        4. Quit
        
        """;
    }
}

