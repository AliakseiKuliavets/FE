// 1.
for (let i = 0; i <= 10; i++) {
    if (i % 2 == 0) {
        console.log(i);
    }
}


// 2.a
for (let i = 55; i >= 20 ; i--) {
        console.log(i);
}

// 2.b
const numbers = [3, 5, 11, 2, 8, 1, 6];
for(let i = 0; i < numbers.length; i++) {
    console.log(numbers[i])
};

// 2.c

const numbers_squared = []
for (let i = 0; i < numbers.length; i++) {
    numbers_squared.push(numbers[i] ** 2)
}
console.log(numbers_squared)

// 3 
let last_elem = numbers_squared[numbers_squared.length - 1];
console.log(last_elem)

// 4 
const user = {
    first_name: 'Ivan',
    last_name: 'Ivanov',
    age: 20,
    salary: 500
}
    console.log(`User's name is ${user.first_name} ${user.last_name}. He is ${user.age} years old`);
