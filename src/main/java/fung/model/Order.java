package main.java.fung.model;

import java.lang.String;
import java.util.Vector;

public class Order {
    private Vector<Dish> order;
    public Order(String[] orderInput) {
        this.order = new Vector<Dish>();
        for(String str : orderInput) {
            this.order.add(new Dish(str));
        }
    }

    public Vector<Dish> getOrder() {
        return order;
    }

    public double getTotal() {
        double total = 0.0;
        for(Dish dish : this.order) {
            total += dish.getTotal();
        }
        return total;
    }

    public StringBuffer printDetail() {
        StringBuffer detail = new StringBuffer("");
        for(Dish dish : this.order) {
            detail.append(dish.printDetail() + "\n");
        }
        return detail;
    }

    public static void test() {
        String[] input = {"ITEM0001 x 1", "ITEM0013 x 2", "ITEM0022 x 1"};
        Order order = new Order(input);
        System.out.println(order.getTotal());
        for (Dish dish : order.getOrder()){
            System.out.println(dish.getTotal());
            System.out.println(dish.getItem().getName());
        }
    }
}
