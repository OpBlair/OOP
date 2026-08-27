'use strict';

class Student{
    constructor(name, age, programme, year){
        this.name = name;
        this.age = age;
        this.programme = programme;
        this.year = year;
    }

    getDetails(){
        console.log(`${this.name} is a year ${this.year} student pursuing ${this.programme}.`);
    }

    isAdult(){
        if(this.age > 18){
            console.log(`${this.name} is an adult`);
        }
    }

    promoteYear(){
        this.year += 1;
        console.log(`${this.name} has been promoted to year ${this.year}`);
    }
}

class Programme{
    constructor(name, code, duration){
        this.name = name;
        this.code = code;
        this.duration = duration;
    }

    getDetails(){
        console.log(`${this.name} is a ${this.duration} year programme with code: ${this.code}`);
    }
}

let students = [
    {name: "John", age: 24, programme: "Law", year: 2},
    {name: "Doe", age: 23, programme: "IT", year: 2}
];

let s1 = new Student(students[0].name, students[0].age, students[0].programme, students[0].year);
s1.getDetails();

const info = students.map(student => new Student(student.name, student.age, student.programme, student.year));

info.forEach(s => s.getDetails());
info.forEach(s => s.isAdult());
info.forEach(s => s.promoteYear());

let programs = [
    {name: "Computer Science", code: "BSCS", duration: 3},
    {name: "Data Science", code: "BSDS", duration: 3},
    {name: "Information Technology", code: "BSIT", duration: 3}
];

const details = programs.map(program => new Programme(program.name, program.code, program.duration));

details.forEach(p => p.getDetails());
