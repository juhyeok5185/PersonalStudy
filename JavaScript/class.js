'use strict'

//class
class Person {
    constructor(name,age){ //생성자
        this.name = name;
        this.age = age;
    }

    speak() {
        console.log(`${this.name}:hello!`);
    }
}

const ellie = new Person('ellie',20);
console.log(ellie.name);
console.log(ellie.age);
ellie.speak();

//Getter , Setter
class User{
    constructor(firstName, lastName, age){
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
    }

    get age() {
        return this._age;
    }

    set age(value){
        this._age = value < 0 ? 0 : value;
    }
}

const user1 = new User('steve' , 'job', -1);
console.log(user1.age);

//상속
class Shape{
    constructor(width , height , color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    draw(){
        console.log(`drwaing ${this.color} color of`);
    }

    getArea(){
        return this.width * this.height;
    }
}

class Rectangle extends Shape{}
class Triangle extends Shape{
    getArea(){
        super.draw(); //부모의 메소드를 상속한다.
        return this.width * this.height/2; //dhqjfkdleld
    }
}
console(Rectangle.getArea());
const Rectangle = new Rectangle(20,20,'blud');
Rectangle.draw();
console.log(Triangle.getArea());
