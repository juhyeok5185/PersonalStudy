'use strict';

// 1. String 연산
console.log("my" + "cat");
console.log("1" + 2);

// 2. 숫자 연산자
console.log(1 + 1);
console.log(2 ** 3); //2의 3승

// 3. 증감 연산자;
let counter = 2;
const preIncrement = ++counter;
// counter = counter + 1;
// preIncrement = counter;
const preIncrement2 = counter++;
//값을 넣고 그 뒤에 +;

// 4. 반복 연산자
let x = 3;
let y = 6;
x += y;

// 5. 비교연산자
console.log(10 <= 6); //false;

// 6. or , and , not
const value1 = false;
const value2= 4 < 2;
console.log(`or : ${value1 || value2 || check()}`); //함수는 뒤로
console.log(`or : ${value1 && value2 && check()}`); //함수는 뒤로
console.log(!value1); //반대로

function check(){
    for(let i = 0; i < 10; i++){
        console.log('하이');
    }
    return true;
}

// 7. Equality
const stringFive = '5';
const numberFive = 5;
console.log (stringFive == numberFive); //타입이 달라도 같은면 true
console.log (stringFive !== numberFive); //타입도 같이 체크

// 8. if문
const name = "danny";
if (name === 'ellie'){
    console.log('Welcom, Ellie!');
} else if(name === 'coder'){
    console.log('hihi');
} else {
    console.log('unkwnon');
}

// 9. 삼항연산자
console.log(name === 'danny' ? 'yes' : 'no');

// 10. switch문
let menuNum = 3;
switch(menuNum){
    case 1 : 
    console.log("1");
    break;
    case 2 : 
    console.log("1");
    break;
    case 3 : 
    console.log("1");
    break;
    default : break;
}

// 11. while
let i = 3;
while (i > 0){
    console.log(i);
    i--;
}

// 12. do while
do{console.log("DO WIHER")
i--;
} while(i >0);

// 13. for문
for(let i = 3; i > 0; i = i - 2){
    console.log(i);
}

// 14. break는 완전히 반복문을 끝냄
// continue는 지금 루프만 끝내고 다음 루프로 시작
