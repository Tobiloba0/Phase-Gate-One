let numbers = [5, 14, 7, 32, 9];

let largest = numbers[0];

for (let index = 1; index < numbers.length; index++) {
    if (numbers[index] > largest) {
        largest = numbers[index];
    }
}

console.log(" The largest number is:", largest);

