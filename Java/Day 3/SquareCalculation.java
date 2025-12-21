import java.util.Scanner;
public class SquareCalculation{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter the first number: ");
    int number1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = input.nextInt();

    int squareNumberOne = number1 * number1;

    int squareNumberTwo = number2 * number2;

    int sumOfSquares = squareNumberOne + squareNumberTwo;

    int differenceOfSquare = squareNumberOne - squareNumberTwo;

    
    System.out.println("Square of number one = " + squareNumberOne);

    System.out.println("Square of number two = " + squareNumberTwo);

    System.out.println("Sum of squares = " + sumOfSquares);

    System.out.println("Difference of the squares = " + differenceOfSquare);

    

    

    

            




    }
}
