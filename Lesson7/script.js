// // 1.Напишите функцию, которая принимает два числовых аргумента и выводит в консоль все четные числа от большего к меньшему.

// let num1 = +prompt("Введите первое число")
// let num2 = +prompt("Введите второе число")

// function SM(num1, num2) {
//     if (num1 > num2) {
//         if (num1 % 2 == 0) {
//             for (let i = num1; i >= num2; i -= 2) {
//                 console.log(i)
//             }
//         } else {
//             let x = num1 - 1
//             for (let i = x; i >= num2; i -= 2) {
//                 console.log(i)
//             }
//         }
//     } else if (num1 < num2) {
//         if (num2 % 2 == 0) {
//             for (let i = num2; i >= num1; i -= 2)
//                 console.log(i)
//         } else {
//             let x = num1 - 1
//             for (let i = x; i < num2; i += 2) {
//                 console.log(i)
//             }
//         }
//     } else {
//         if (num1 % 2 == 0) {
//             console.log(num1)
//         } else {
//             console.log("нет четных чисел")
//         }
//     }
// }
// SM(num1, num2)


// // 2. Напишите функцию power, которая принимает два числовых аргумента (основание степени и саму степень)
// // и возвращает число в указанной степени. Значение степени должно быть указано по умолчанию 2.
// let n1 = +prompt("Введите число которую хотите возвести в степень")
// let n2 = +prompt("Введите в которую степень хотите возвести число")

// function power(n1 , n2) {
//     if (n2 == 0) {
//         let degree = n1 ** 2
//         console.log(degree)
//     } else {
//         let degree = n1 ** n2
//         console.log(degree)
//     }
// }

// power(n1 ,n2)


// // 3.Напишите функцию, которая принимает числовой аргумент n и считает сумму чисел от 1 до n.

// let n = +prompt("Введите числовой аргумент n")

// function sum(n) {
//     let x = 0
//     for(let i = 1; i <= n; i++){
//         x = (n * (n+1)) / 2
//     }
//     console.log(x)

// }
// sum(n)


// // 4. Напишите функцию, которая принимает два числовых аргумента n и m
// //и считает сумму четных чисел и нечетных чисел от n до m.
// //Суммы выведите в консоль (в начале сумму четных чисел, а затем сумму нечетных).


// function array(N, M) {
//     let sumEven = 0;
//     let sumOdd = 0;
//     let numberArray = []
//     for (let i = N; i <= M; i++) {
//         numberArray.push(i);
//     }
//     for (let i = 0; i < numberArray.length; i++) {
//         if (numberArray[i] % 2 == 0) {
//             sumEven += numberArray[i]
//         }
//     }

//     for (let i = 0; i < numberArray.length; i++) {
//         if (numberArray[i] % 2 != 0) {
//             sumOdd += numberArray[i]
//         }
//     }
//     console.log(sumOdd)
//     console.log(sumEven)
// }
// array(+prompt("Первый числовой аргумент "), +prompt("Второй числовой аргумент"));




// // 5.Напишите функцию, которая принимает в качестве аргументов массив строк, а возвращает первый самый длинный элемент массива.
// // Если входной массив пуст, функция возвращает null. Если есть несколько одинаковых по длине элементов - функция возвращает первый
// // из этих элементов. (string.length > string.length) - сравнение длины строк
// // Пример: [ 'one', 'two', 'three' ] => 'three'

// function Name(nameTheArray) {
//     if ( nameTheArray < [0]) {
//         return "null"
//     } else {
//         return nameTheArray.reduce(function (lname,
//             number) {
//            if (lname.length > number.length) {
//             return number
//            } else if (lname.length == number.length) {
//             return lname
//         } else {
//             return number
//         }
//         },
//             "");
//     }
// }
// console.log(Name(['one', 'two', 'three', 'viwee']));