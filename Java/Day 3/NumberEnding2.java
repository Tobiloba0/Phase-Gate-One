import java.util.Scanner;
public class NumberEnding{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    String userInput = input.nextLine().trim();
    
    char lastDigit = userInput.charAt(userInput.length()-1);
       if(lastDigit == '5'){
        System.out.println("true");
        }else
        System.out.println("false");
    }

}
