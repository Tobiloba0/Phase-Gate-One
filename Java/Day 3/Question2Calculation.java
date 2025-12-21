//Write an application that input three integers from the user and displays the sum average product smallest largest of he number 
//colllect three numbers sum smallest largest average and product

import java.util.Scanner;
public class SquareCalculation{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
  
   
    System.out.print("Enter the first number: ");
    int number1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = input.nextInt();
    
    System.out.print("Enter the third number: ");
    int number3 = input.nextInt();

    int largest = number1;
    int smallest = number1;
    

    int sum = number1 + number2 + number3;

    int average = sum / 3;

    int product = number1 * number2 * number3;


    if (number2 > number1 && number3 > number1){
    largest = number2;
            
    }
    else if (number3 > number1 && number3 > number1){
    largest = number3;
            
    }
    
    if (number2 < number1 && number3 < number1){
    smallest = number2;
            
    }
    else if (number3 < number1 && number3 < number1){
    smallest = number3;
            
    }

    System.out.println("The smallest number is " + smallest);

    System.out.println("The largest number is " + largest);
    
    System.out.println("The sum of the numbers is " + sum);

    System.out.println("The average number is " + average);

    System.out.println("The product number is " + product);


    }
}
