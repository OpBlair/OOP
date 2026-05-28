'use strict';

class Book{
    constructor(title, author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    borrowBook(){
        if(!this.isAvailable) {
            console.log(`Oops, the Book ${this.title} has been borrowed already.`)
            return;
        }

        this.isAvailable = false;
        console.log(`You have borrowed the Book ${this.title} by ${this.author}`);
        
    }

    returnBook(){
        this.isAvailable = true;
        console.log(`You have returned the Book ${this.title}.`);
    }
}

let book1 = new Book("Atomic Habits", "James Clear");
book1.borrowBook();