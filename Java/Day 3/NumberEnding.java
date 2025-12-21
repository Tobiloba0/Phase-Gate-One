import java.util.Scanner;
public class NumberEnding{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int userInput = input.nextInt();
       if(userInput % 10 == 5){
        System.out.println("true");
        }else
        System.out.println("false");
    }

}
