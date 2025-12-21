import java.util.Scanner;

public class SecondLargest{
    public static void main(String[]args){
    int[] numbers = {5,8,4,12,33,45,63,70};

    int largest = numbers[0];
    int secondLargest = numbers[0];

    for(int index = 0; index < numbers.length; index++){
        if(numbers[index] > largest)
        largest = numbers[index];
    }
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] != largest && numbers[count] > secondLargest)
            secondLargest = numbers[count];
        }
        System.out.println(largest);

        System.out.println(secondLargest);

    }
}
