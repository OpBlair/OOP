import java.util.List;
import java.util.ArrayList;

class Animal{
    String sound;
    int numberOfLegs;

    Animal(String sound, int numberOfLegs){
        this.sound = sound;
        this.numberOfLegs = numberOfLegs;
    }
}

class Student{
    String name;
    int age;

    Student(){
        this.name = "Unknown";
        this.age = 0;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    String display(){
        return String.format("%s is %d years old.", this.name, this.age);
    }
}

class Rectangle{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    String calculateArea(){
        double area = (this.length * this.width);
        return String.format("Area of rectangle with length %.2f and width %.2f is %.2f", this.length, this.width, area);
    }
}

class Circle{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    String getArea(){
        double area = (Math.PI * radius * radius);
        return String.format("Area of circle with radius %.1f is %.2f", this.radius, area);
    }
}

class Car{
    String brand;
    int speed;

    Car(){
        this.brand = "Unknown";
        this.speed = 0;
    }

    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    String displayCar(){
        return String.format("%s is moving at %d km/h", this.brand, this.speed);
    }
}

class BankAccount{
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String deposit(double amount){
        this.balance += amount;
        return String.format("New balance for account %s is %.2f", this.accountNumber, this.balance);
    }

    String withdraw(double amount){
        if(amount <= 0){
            return "Withdrawal amount must be positive.";
        }
        if(this.balance >= amount){
            this.balance -= amount;
            return String.format("New balance for account %s is %.2f", this.accountNumber, this.balance);
        }else{
            return String.format("Cannot withdraw from an empty. Insufficient balance.");
        }
    }
}

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    String raiseSalary(double percent){
        this.salary = this.salary + (this.salary * (percent / 100));
        return String.format("%s your new salary is %.2f.", this.name, this.salary);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String greet(Person anotherPerson){
        return String.format("Hello %s, I'm %s !", anotherPerson.name, this.name);
    }
}

class Book{
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String displayBookInfo(){
        return String.format("%s authored by %s is being sold at %.0f", this.title, this.author, this.price);
    }
}

class Laptop{
    String brand;
    int ramSize;
    double price;

    Laptop(String brand, int ramSize, double price){
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    String comparePrice(Laptop otherLaptop){
        if(this.price < otherLaptop.price){
            return String.format("%s is cheaper than %s.", this.brand, otherLaptop.brand);
        }else if(this.price > otherLaptop.price){
            return String.format("%s is cheaper than %s.", otherLaptop.brand, this.brand);
        }else{
            return String.format("%s and %s have the same price.", this.brand, otherLaptop.brand);
        }
    }
}

public class Classes{
    public static void main(String[] args){
        List<Book> books = new ArrayList<>();

        Animal dog = new Animal("woof woof", 4);
        System.out.printf("A dog has %d legs and says %s.%n", dog.numberOfLegs, dog.sound);

        Student student1 = new Student();
        Student student2 = new Student("Peter", 29);
        System.out.println(student1.display());
        System.out.println(student2.display());

        Rectangle rectangle1 = new Rectangle(5, 2.0);
        System.out.println(rectangle1.calculateArea());

        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());

        Car car1 = new Car();
        Car car2 = new Car("Hilux", 100);
        System.out.println(car1.displayCar());
        System.out.println(car2.displayCar()); 

        BankAccount account1 = new BankAccount("12345ACDE", 10000);
        System.out.println(account1.deposit(50000));
        System.out.println(account1.withdraw(7000));

        Employee employee1 = new Employee("Joseph", 20000);
        Employee employee2 = new Employee("Lucy", 18000);
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee2.raiseSalary(15));

        Person person1 = new Person("Alice", 21);
        Person person2 = new Person("Martha", 22);
        System.out.println(person1.greet(person2));
        System.out.println(person2.greet(person1));

        books.add(new Book("Atomic Habits", "James Clear", 75000));
        books.add(new Book("Human Nature", "James Clear", 90000));
        books.add(new Book("Design Patterns", "James Brown", 120000));

        for(Book book : books){
            System.out.println(book.displayBookInfo());
        }

        Laptop laptop1 = new Laptop("HP", 8, 700000);
        Laptop laptop2 = new Laptop("Dell", 16, 1200000);
        System.out.println(laptop1.comparePrice(laptop2));
    }
}