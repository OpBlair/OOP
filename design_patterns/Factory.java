abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    void speak() { System.out.println("Woof Woof!"); }
}

class Cat extends Animal {
    void speak() { System.out.println("Meow~"); }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}

public class Factory{
    public static void main(String[] args) {
        System.out.println("=== Factory Pattern Demo ===\n");

        Animal a1 = AnimalFactory.createAnimal("dog");
        Animal a2 = AnimalFactory.createAnimal("cat");

        if (a1 != null) a1.speak();
        if (a2 != null) a2.speak();
    }
}