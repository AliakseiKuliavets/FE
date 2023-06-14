// Задача. Есть массив products. 
// 1. Для каждого объекта в массиве products создать разметку
// 2. Отобразить только те продукты, цена которых больше 10000
// 3. Отобразить только те продукты, категория которых - phone

const products = [
    {
        name: "Iphone 13",
        category: "phone",
        price: 15000
    },
    {
        name: "Iphone 14",
        category: "phone",
        price: 20000
    },
    {
        name: "Acer",
        category: "laptop",
        price: 40000
    },
    {
        name: "Asus",
        category: "laptop",
        price: 35000
    },
    {
        name: "Samsung",
        category: "TV",
        price: 27000
    },
    {
        name: "LG",
        category: "TV",
        price: 7000
    },
]

/*
    <div class="product">
        <h3> {имя продукта} </h3>
        <p> {категория продукта} </p>
        <p> {цена продукта} </p>
        <button>Купить</button>
    </div>
*/

const section = document.querySelector("main section")

////1. Для каждого объекта в массиве products создать разметку
// for( let i = 0; i < products.length; i++) {
//     section.innerHTML += `
//     <div class="product">
//         <h3> ${products[i].name} </h3>
//         <p> ${products[i].category} </p>
//         <p> ${products[i].price} </p>
//         <button>Купить</button>
//     </div>  `
// }


////2.Отобразить только те продукты, цена которых больше 10000
// for(let i = 0; i < products.length; i++) {
//     if (products[i].price >= 10000) {
//         section.innerHTML += `
//     <div class="product">
//         <h3> ${products[i].name} </h3>
//         <p> ${products[i].category} </p>
//         <p> ${products[i].price} </p>
//         <button>Купить</button>
//     </div>  `
//     }
// }


////3.Отобразить только те продукты, категория которых - phone
// for(let i = 0; i < products.length; i++) {
//     if (products[i].category == "phone") {
//         section.innerHTML += `
//     <div class="product">
//         <h3> ${products[i].name} </h3>
//         <p> ${products[i].category} </p>
//         <p> ${products[i].price} </p>
//         <button>Купить</button>
//     </div>  `
//     }
// }