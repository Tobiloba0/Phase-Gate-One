import java.util.Scanner;
public class NumberEnding{

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("What day is it? ");
    String userInput = input.nextLine().trim().toLowerCase();

        switch(userInput){
    
        case "monday" -> System.out.println("It is a weekday");
        case "tuesday" -> System.out.println("It is a weekday");
        case "wednesday" -> System.out.println("It is a weekday");
        case "thursday" -> System.out.println("It is a weekday");
        case "friday" -> System.out.println("It is a weekend");
        case "saturday" -> System.out.println("It is a weekend");
        case "sunday" -> System.out.println("It is a weekend");
        default -> System.out.println("Invalid data entry");
        }

    }

}
