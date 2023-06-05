// 1.

let number = +prompt ("Enter a number to determine 10%");
let result = number * (10 / 100);
console.log(result);

// 2. 

let numberA = +prompt("Enter the first number to determine the smallest");
let numberB = +prompt("Enter the second number to determine the smallest");
if (numberA > numberB) {
    console.log(numberA);
}
else {
    console.log(numberB);
}

// 3.

let number100 = +prompt("Enter a number to compare against 100");
if(number100 > 100) {
    console.log("Number greater than 100");
}
else if (number100 == 100){
    console.log("The number is 100");
}
else {
    console.log("Number less 100");
}

// 4.

let name = prompt("What is your name ?");
let year = +prompt("How old are you");
if(year >= 18) {
    console.log(`Hello, ${name}`);
}
else {
    console.log(`Hi, ${name}`);
}