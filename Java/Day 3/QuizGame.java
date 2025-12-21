import java.util.Scanner;
public class NumberEnding{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    int score = 0;

    String question1 = """
    What is the capital of France?
    Options
    1. Nigeria
    2. London
    3. Berlin
    4. Paris
    
    Choose an option by selecting from 1 through 4.
    """;
  
    String question2 = """
    What is the capital of Nigeria?
    Options
    1. FCT
    2. Ibadan
    3. Ife
    4. Jos

    """;

    String question3 = """
    What is soil?
    Options
    1. Earthcrust
    2. Water
    3. Rope
    4. River

    """;

    String question4 = """
    What is the capital of France?
    Options:

    1. Paris
    2. London
    3. Berlin
    4. Rome

    """;

    String question5 = """
    What is the capital of France?
    Options:

    1. Paris
    2. London
    3. Berlin
    4. Rome

    """;
    System.out.print(question1);

    int userInput = input.nextInt();

    switch(userInput){
    case 1, 2, 3 -> System.out.print("Inorrect");
    case 4 -> {
                System.out.println("Correct");
                score++;
                }
    default -> System.out.println("Invalid entry, try again");
        
    
    }//switch closedY
    System.out.println("Your current score is "+ score);

    System.out.println(question2);
    
    int userInput2 = input.nextInt();
    switch(userInput2){
    case 1 ->{ System.out.print("Correct");
             score++;
            }
    case 2, 3, 4 -> System.out.println("InCorrect");
    default -> System.out.println("Invalid entry, try again");

    
    }System.out.println(question3);
    
    int userInput3 = input.nextInt();
    switch(userInput2){
    case 1 ->{ System.out.print("Correct!!! ");
             score++;
            }
    case 2, 3, 4 -> System.out.println("InCorrect");
    default -> System.out.println("Invalid entry, try again");
}

   System.out.println("Your final score is "+ score);
 }
}


