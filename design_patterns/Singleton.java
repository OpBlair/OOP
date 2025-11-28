public class Singleton {
    // Step 1: The one and only instance
    private static Singleton instance;

    // Step 2: Private constructor — no one can do "new Singleton()"
    private Singleton() {
        System.out.println("Singleton is born!");
    }

    // Step 3: Global access point
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Just a method to prove it's the same object
    public void sayHello() {
        System.out.println("Hello! I am the only Singleton: " + this.hashCode());
    }

    public static void main(String[] args) {
        System.out.println("=== Singleton Demo ===\n");

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.sayHello();
        s2.sayHello();

        System.out.println("Same object? " + (s1 == s2));  // true
    }
}