package object_modeling.Problem4_Ecommerce;

import java.util.*;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public String getName() {
        return name;
    }
}
