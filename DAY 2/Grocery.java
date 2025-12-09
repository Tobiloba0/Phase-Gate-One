import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("Welcome to Tobiloba Online Strore");

        System.out.print(display());
        int userInput = input.nextInt();
            if (userInput == 1){
                
            while (true) {
            System.out.print("Enter product name or type 'done' to finish: ");
            String name = input.nextLine();
            
            if (name.equalsIgnoreCase("done"))  

            break;
            
            System.out.print("Enter price: ");
            if (input.hasNextDouble()) {
                double price = input.nextDouble();
                products.add(name);
                prices.add(price);
            } else {
                System.out.println("Invalid price, try again.");
                input.nextLine(); // clear invalid input
            }
        }
   
            
            }else if (userInput == 2){
                 System.out.println("Enter the product name you would like to remove?");
              String userDeletionInput = input.nextLine();
       
//                products.removeAtIndex(userDeletionInput); 
            System.out.print("Removed successfully");
                 
            }else if (userInput == 3){
                          
            }
      }
        
        public static String display(){
        
        String menu = """
        Select from the options displayed below.
        1. Add items
        2. Remove items 
        3. Show all available items

        """;
        return menu;
        }

        
        

}
