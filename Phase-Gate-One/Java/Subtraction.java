import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Subtraction{
    public static void main(String[]args){
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int questions = 10;
    int attempt = 2;
    int score = 0;
    int startTime = (int)System.currentTimeMillis();

    
    System.out.println("Welcome to Subtraction Game");


//    for(int question = 0; question ==;){}

        for(int index = 1; index <= questions; index++){
           

            int number1 = random.nextInt(20)+1;
            int number2 = random.nextInt(20)+1;
            
              if(number1 < number2){
                number2 = number1;
              }

                if(attempt < 1){
                    System.out.println("Game over");
                    break;

                    }

            System.out.print(number1 + "-" + number2 +" = ");

            int userInput = input.nextInt();
                 
              if(userInput == subtract(number1, number2)){
                score++;

                System.out.println("Good boy, you get sharp brains");
                }
              else if(userInput != subtract(number1, number2)){
                attempt--;

              System.out.println("Dullard boy, you no sabi anything for this life, try again! ");
                
              System.out.println("You hava only " + attempt + " attempt left.");
              }
       
        }
            
       int stopTime = (int)System.currentTimeMillis();
       int timeUsed = (stopTime - startTime) / 1000;
            System.out.println("You got " + score + " out of 10");
            System.out.print("You spent " + timeUsed + " seconds playing this game.");

    }

    public static int subtract(int number1, int number2){
    // switch place if number 1 is smaller than number 2
        int result = 0;
        int extra;
            if(number1 > number2){
            result+= number1 - number2;
            }
            if (number1 < number2){
            extra = number1;
            number1 = number2;
            result+= number1 - extra;
            }

            return result;
        

      }

}
