import java.util.Scanner;
public class factorial{
    public static void main(String[]args){

int numbers = [50,11,13,45,89,17,93,12]

int largest = numbers[0]
int secondLargest = numbers[1]
for(int count = 0;count < numbers.length; count++){
    if(largest < numbers[count]){
        largest = numbers[count]
    }
}


for(int index = 0; index < numbers.length; index++){
if(numbers[index] == largest) secondLargest = numbers[index+1]
    if(secondLargest < numbers[index] && numbers[index] != largest){
    secondLargest = numbers[index]
    }
}
System.out.print(secondLargest);
