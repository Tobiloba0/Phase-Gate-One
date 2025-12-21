const prompt = require("prompt-sync")({sigint: true});
   
    let number1 = parseInt(prompt("Enter the first number: "));
 
    let number2 = parseInt(prompt("Enter the second number: "));
    
    let number3 = parseInt(prompt("Enter the third number: "));
    
    

    let largest = number1;
    let smallest = number1;
    
    let sum = number1 + number2 + number3;

    let average = sum / 3;

    let product = (number1 * number2) * number3;

    if (number2 > number1 && number3 > number1){
    largest = number2;
            
    }
    else if (number3 > number1 && number3 > number2){
    largest = number3;
            
    }
    
    if (number2 < number1 && number3 < number1){
    smallest = number2;
            
    }
    else if (number3 < number1 && number3 < number1){
    smallest = number3;
            
    }

    console.log("The smallest number is " + smallest);

    console.log("The largest number is " + largest);
    
    console.log("The sum of the numbers is " + sum);

    console.log("The average number is " + average);

    console.log("The product number is " + product);


