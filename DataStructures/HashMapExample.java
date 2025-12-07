import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store the car models with their year as key-value pairs
        HashMap<String, Integer> cars = new HashMap<String, Integer>();
        
        // Adding elements (key-value pairs)
        cars.put("Volvo", 2020);
        cars.put("BMW", 2018);
        cars.put("Ford", 2021);
        cars.put("Mazda", 2019);
        
        // Printing the entire HashMap
        System.out.println("Car models and their years: " + cars);
        
        // Accessing value by key
        int bmwYear = cars.get("BMW");
        System.out.println("BMW was manufactured in: " + bmwYear);
        
        // Checking if a key exists in the HashMap
        if (cars.containsKey("Ford")) {
            System.out.println("Ford is in the list with the year: " + cars.get("Ford"));
        }
        
        // Removing a key-value pair
        cars.remove("Mazda");
        System.out.println("After removing Mazda: " + cars);
        
        // Iterating over the HashMap entries
        System.out.println("All car models and their years:");
        for (String car : cars.keySet()) {
            System.out.println(car + " was manufactured in " + cars.get(car));
        }
    }
}
