'use strict';

class Student{
    constructor(name, age, programme, year){
        this.name = name;
        this.age = age;
        this.programme = programme;
        this.year = year;
    }

    printName(){
        console.log(`${this.name} is a year ${this.year} student pursuing ${this.programme}.`);
    }
}

let students = [
    {
        name: "John",
        age: 24,
        programme: "Law",
        year: 2
    },
    {
        name: "Doe",
        age: 23,
        programme: "IT",
        year: 2
    }
];

let s1 = new Student(students[0].name, students[0].age, students[0].programme, students[0].year);
s1.printName();

const info = students.map(student => new Student(student.name, student.age, student.programme, student.year));

info.forEach(s => s.printName());