package main.java.fung.service;

import main.java.fung.model.Order;

public class Minus6 extends Promotion{
    public Minus6() {
        super("满30减6元");
    }

    @Override
    public double computeDiscount(Order order){
        return order.getTotal() >= 30 ? 6.0 : 0.0;
    }

    public static void test() {
        String[] input = {"ITEM0001 x 1", "ITEM0013 x 2", "ITEM0022 x 1"};
        Order order = new Order(input);
        Minus6 promotion0 = new Minus6();
        System.out.println(promotion0.getType());
        System.out.println(promotion0.computeDiscount(order));
    }
}
