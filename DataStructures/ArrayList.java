import java.util.ArrayList;

public class ArrayList {
  public static void main(String[] args) {
    // Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    // Print the initial list
    System.out.println("Initial list: " + cars);
    
    // Removing elements from the list
    cars.remove("Ford");  // Removes "Ford" from the list
    cars.remove(0);       // Removes the element at index 0 (in this case, "Volvo")
    
    // Traverse through the list and print each element
    System.out.println("Updated list:");
    for(String car : cars){
      System.out.println(car);
    }
  }
}
