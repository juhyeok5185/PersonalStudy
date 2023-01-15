// 1. 에러를 발생해준다.
'use strict';

// 2. 변수
// let 
// 전에 사용하던 var는 오류를 안내어줘서 위험하다. 호이스팅
let name = 'danny';
console.log(name);
name = 'hello';
console.log(name);

// 3. const
// 한번 작성한 값을 변경할수 없다.
const daysInWeek = 7;
const maxNumber =5;

// 4. 연산자
// 연산자와 스트링 함수까지 변수에 할당이 가능하다.
const count = 17;
const siza = 17.1;
console.log(`value: ${count}, type: ${typeof count}`);
const infinity = 1 / 0; //무한대에 빠져 Infinity를 보여준다.
const negativeInfinity = -1 / 0; // -Infinity
const nAn = 'not a number' / 2; // String 과 숫자의 나눗셈은 NaN

// 5. String
const char = 'char'
const brendan = 'brendan';
const greeting = 'hello' + brendan;

// 6. boolean
const canRead = true;
const test = 3 < 1;

// 7. null
// 너는 텅텅 비어있다.
let nothing = null; 

// 8. undefined
// 선언은 되었지만 값을 찾을수가 없다.
let x; 

// 9. object (변수의 폴더)
const ellie= {name : 'ellie' , age:20};
ellie.age = 21;
