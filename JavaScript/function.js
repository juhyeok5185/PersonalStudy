// 1. function
function printHello(){
    console.log('Hello');
}
printHello();

function log(message){
    console.log(message);
}
log('Hello');

// 2. parameters
function changeName(obj){
    obj.name = 'coder';
}
const ellie ={name : 'ellie'};
changeName(ellie);
console.log(ellie); //name : 'coder';


// 3. Default parameters (added in ES6)
function showMessage(message , from = 'unknown'){
    console.log(`${message} by ${from}`)
}
showMessage('HI!')

// 4. Rest parameters
function printAll(...args){  //...은 배열 형태로 전달한다
    for(let i = 0; i < args.length; i++){
        console.log(args[i]);
    }
    printAll('dream', 'coding', 'ellie');
}

// 5. return a value
function sum(a,b){
    return a + b;
}
const result = sum(1,2); // 3

// 6. anonymous function
const print = function() {
    console.log('print');
}
print();

// Arrow function
// const simplePrint = function() {
//     console.log('simplePrint!')
// }

const simplePrint = () => console.log('simplePrint!');
const add = (a,b) => a+b; 