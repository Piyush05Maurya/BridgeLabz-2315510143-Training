package object_modeling.Problem4_Ecommerce;

public class Main4 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");

        Product p1 = new Product("Apples", 6.0);
        Product p2 = new Product("Milk", 2.0);

        Order o1 = new Order();
        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);

        System.out.println("Customer: " + c1.getName());
        System.out.println("Total Bill: $" + o1.getTotal());
    }
}
