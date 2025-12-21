public class Smallest{
    public static void main(String[]args){
        int[] numbers = {3,7,9,4,6,8};

        int smallest = numbers[0]; 

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < smallest){
            smallest = numbers[index];
            }    
    
        }

        System.out.println("The smallest number is " + smallest);


    }

}
