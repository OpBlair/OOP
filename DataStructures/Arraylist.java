import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    //Removing elements from the list
    cars.remove("Ford");
    cars.remove(0);
    
  }

}

