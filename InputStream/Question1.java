import java.util.*;
class Order{
    String customerName;
    int phoneQty;
    int phoneChargerQty;
    int headSetQty;

    public Order(String customerName, int phoneQty, int phoneChargerQty, int headSetQty){
        this.customerName = customerName;
        this.phoneQty = phoneQty;
        this.phoneChargerQty = phoneChargerQty;
        this.headSetQty = headSetQty;
    }

    public int calculateAmount(){
        int phonePrice = 800000;
        int chargerPrice = 40000;
        int headsetPrice = 20000;

        return (phoneQty * phonePrice) + (phoneChargerQty * chargerPrice) + (headSetQty * headsetPrice);
    }

    @Override
    public String toString(){
        return customerName + " owes " + calculateAmount() + " UGX";
    }
}

public class Question1{
    public static void main(String[] args){
        List<Order> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of orders: ");
        int numberOfOrders = scanner.nextInt();
        scanner.nextLine();
        
        for(int a = 0; a < numberOfOrders; a++){
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone quantity: ");
            int phoneQty = scanner.nextInt();
            System.out.print("Enter phone Charger Quantity: ");
            int chargerQty = scanner.nextInt();
            System.out.print("Enter head set quantity: ");
            int headsetQty = scanner.nextInt();
            scanner.nextLine();
            
            orders.add( new Order(name, phoneQty, chargerQty, headsetQty));
        }

        System.out.printf("%-12s | %-6s | %-8s | %-16s%n", "Customer", "Phones", "Chargers", "Headsets", "Total Owed (UGX)");
        System.out.println("..........................................");
        for (Order n : orders){
            System.out.printf("%-12s | %-6d | %-8d | %-16d%n", n.customerName, n.phoneQty, n.phoneChargerQty, n.headSetQty, n.calculateAmount());
        }

        scanner.close();        
    }
}