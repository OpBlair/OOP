interface PaymentMethod {
    void pay(int amount);
}

class CreditCard implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPal implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class ShoppingCart {
    private PaymentMethod method;

    public void setPaymentMethod(PaymentMethod method) {
        this.method = method;
    }

    public void checkout(int amount) {
        if (method == null) {
            System.out.println("No payment method selected!");
            return;
        }
        method.pay(amount);
    }
}

public class Strategy{
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===\n");

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentMethod(new CreditCard());
        cart.checkout(250);

        cart.setPaymentMethod(new PayPal());
        cart.checkout(99);
    }
}