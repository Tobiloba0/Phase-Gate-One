public class Largest{
    public static void main(String[]args){
        int[] numbers = {3,7,9,4,6,8};

        int largest = numbers[0]; 

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > largest){
            largest = numbers[index];
            }    
    
        }

        System.out.println("The largest number is " + largest);


    }

}
