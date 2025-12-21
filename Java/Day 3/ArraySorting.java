public class ArraySorting{
    public static void main(String[]args){

int [] array1 = {1,4,11,6,9,12};
int [] array2 = new int [array1.length];

    for(int index = 0; index < array1.length; index ++){
        for(int rotate = 1; rotate < array1.length; rotate++){
            if (array1[0] < array1[index]){
                array2[index] = array1[index];
            } 
        } 
                 
    }
        System.out.print(array2);
        }

    }
