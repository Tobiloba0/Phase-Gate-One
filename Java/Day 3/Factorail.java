import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int userInput = input.nextInt();
    System.out.println(factorial(userInput));
    }

    static int factorial(int userInput){
    int factorialValue = 1;
    for(int count = userInput; count > 0; count--){
         factorialValue *= count;
    }
        return factorialValue;

    }

}
