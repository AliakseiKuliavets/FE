// // 1.Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50).
// // Добавить созданные параграфы в div с классом numbers.

// let body = document.querySelector("body") 
// body.innerHTML = `<div class= "numbers" ></div>`

// let numbers = document.querySelector(".numbers")
// for( let i = 100; i >= 50; i-=10) {
//     numbers.innerHTML += `
//     <p>${i}</p>
//     `
// }

// // 2.Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container.
// // Строки взять произвольные.

// let body = document.querySelector("body") 
// body.innerHTML = `<div class= "string_container" ></div>`

// let string_container = document.querySelector(".string_container")

// let array = ["Hello","It`s`","Me"]

// for( let i = 0; i < array.length; i++) {
//     string_container.innerHTML += `
//     <p>${array[i]}</p>
//     `
// }


// // 3.Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) -
// //  и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя.
// //  Добавить все карточки в div с классом users_container.


// let body = document.querySelector("body") 
// body.innerHTML = `<div class= "user_container" ></div>`

// let user_container = document.querySelector(".user_container")

// let object = [
//     {
//         first_name: "Biba",
//         last_name: "Frog",
//         age: 17
//     },
//     {
//         first_name: "Boba",
//         last_name: "Frogi",
//         age: 31
//     }
// ]

// for(let i=0; i < object.length; i++){
// if( object[i].age >= 18) {
//     user_container.innerHTML += `
//     <div>
//     <p>First Name: ${object[i].first_name}</p>
//     <p>Last Name: ${object[i].last_name}</p>
//     <p>Age: ${object[i].age}</p>
//     </div>
//     `
// }
// }


