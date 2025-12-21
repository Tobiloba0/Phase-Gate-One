
number1 = int(input("Enter the first number: "))

number2 = int(input("Enter the second number: "))

number3 = int(input("Enter the third number: "))

largest = number1;
smallest = number1;

total = number1 + number2 + number3;

average = total / 3;

product = number1 * number2 * number3;

if (number2 > number1 and number3 > number1){
largest = number2;
        
elif (number3 > number1 and number3 > number2){
largest = number3;

if (number2 < number1 and number3 < number1){
smallest = number2;

elif (number3 < number1 and number3 < number1){
smallest = number3;


print("The smallest number is " + smallest);

print("The largest number is " + largest);

print("The sum of the numbers is " + total);

print("The average number is " + average);

print("The product number is " + product);

