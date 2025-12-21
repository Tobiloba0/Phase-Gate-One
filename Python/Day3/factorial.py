userInput = int(input("Enter the number: "));

factorialValue = 1;
for num in range(userInput, 0, -1):
    factorialValue *= num;
print(factorialValue);

