public class Question6Largest{
    public static void main(String[]args){

int maximum = 0;
int [] number = {1,4,11,6,9,};

for(int index = 0; index < number.length; index ++){

   maximum = number[0];
   if (number[1] > number[0]){
    maximum = number[1];
    }
    
    if (number[2] > number[1]){
    maximum = number[2];
    }

    if (number[3] > number[2]){
    maximum = number[3];
    }

    if (number[4] > number[3]){
    maximum = number[4];
    }

}

System.out.println(maximum);

    }


}
