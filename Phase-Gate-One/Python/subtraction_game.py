import random
import time

current_time = time.time()

questions = 10
attempts = 2
score = 0

print("Welcome to Subtraction Game")

def subtract(num1, num2):
    if num1 >= num2:
        return num1 - num2
    else:
        return num2 - num1

for index in range(1, 11):
    number1 = random.randint(0, 21)
    number2 = random.randint(0, 21)

    # Ensure number1 >= number2
    if number1 < number2:
        number1, number2 = number2, number1

    print(f"\nQuestion {index}: What is {number1} - {number2}?")

    while True:
        try:
            user_input = int(input("Your answer: "))
            break
        except:
            print("Invalid input! Enter a number.")

    if user_input == subtract(number1, number2):
        score += 1
        print("Correct! Well done.")
    else:
        attempts -= 1
        print("Wrong answer.")
        print("You have only", attempts, "attempt(s) left.")

        if attempts < 1:
            print("\nGAME OVER!")
            break

print("\nYour final score is:", score)

