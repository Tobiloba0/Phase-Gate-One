
    const prompt = require("prompt-sync")({sigint: true});

    let number1 = prompt("Enter the first number: ");

    let number2 = prompt("Enter the second number: ");

    let squareNumberOne = number1 * number1;

    let squareNumberTwo = number2 * number2;

    let sumOfSquares = squareNumberOne + squareNumberTwo;

    let differenceOfSquare = squareNumberOne - squareNumberTwo;

    
    console.log("Square of number one = " + squareNumberOne);

    console.log("Square of number two = " + squareNumberTwo);

    console.log("Sum of squares = " + sumOfSquares);

    console.log("Difference of the squares = " + differenceOfSquare);


