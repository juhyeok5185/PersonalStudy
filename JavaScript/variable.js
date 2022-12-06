// 1. use trict
// 명확한 조건의 코딩을 하기위해 선언한다.
"use strict";

// 2. Variable (변수)
// let (ES6)
{
  let name = "Danny";
  console.log(name);
  name = "hello";
  console.log(name);
}

// 3. Const
// 값을 선언이후 값을 변경할수없다.
const dyasInWeek = 7;
const maxNumber = 5;

//4. 변수 타입
//number만 존재 생략해도 괜찮음
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
// false : 0 , null, undefined, Nan, ''
const canRead = true;
const test = 3 < 1;

// 7. symbol 식별자 생성
const symbol1 = Symbol('id');

// 8. object
const ellie= {name : 'ellie' , age:20};
ellie.age = 21;