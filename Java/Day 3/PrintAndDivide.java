import java.util.Scanner;
public class PrintAndDivide{
    public static void main(String[]args){
    for(int number = 1; number < 101; number++){
    
        if(number % 3 == 0){
        System.out.print("fuzz");
        }

        else if(number % 5 == 0){
        System.out.print("Buzz");
        }
        
        else if(number % 3 == 0 && number % 5 == 0){
        System.out.print("Fuzzbuzz");        
        }
         System.out.println(number);
     }
   
    }

}
