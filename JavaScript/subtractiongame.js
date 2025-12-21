    const prompt = require("prompt-sync")({sigint: true});
    let questions = 10;
    let questionAttempt = 2;
    let loss = 0;
    let score = 0;
    let StartTime = Date.now();


    
Console.log("Welcome to Subtraction Game");

for(let index = 1; index <= questions; index++){

            let number1 = Math.random(20)+1;
            let number2 = Math.random(20)+1;
            
              if(number1 < number2){
                number2 = number1;
              }

                if(attempt < 1){
                    System.out.println("Game over");
                    break;

                    }

            conslole.log(number1 + "-" + number2 +" = ");

            let userInput = input.nextInt();
                 
              if(userInput == subtract(number1, number2)){
                score++;

                console.log("Good boy, you get sharp brains");
                }
              else if(userInput != subtract(number1, number2)){
              attempt--;

              conslole.log("Dullard boy, you no sabi anything for this life, try again! ");
                
              console.log("You hava only " + attempt + " attempt left.");
              }
                
        }
let endTime = Date.now();

    

  function subtract(number1, number2){
    // switch place if number 1 is smaller than number 2
        let result = 0;
        let extra;
            if(number1 > number2){
            result+= number1 - number2;
            }
            if (number1 < number2){
            extra = number1;
            number1 = number2;
            result+= number1 - extra;
            }

            return result;
        

      }


