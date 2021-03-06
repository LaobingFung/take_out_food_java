package main.java.fung.model;

import java.lang.String;

public class Dish {
    private Item item;
    private int count;
    public Dish(String input) {
        String[] inputs = input.split(" x ");
        this.item = Item.getItem(inputs[0]);
        this.count = Integer.valueOf(inputs[1]);
    }

    public Item getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public double getTotal() {
        return this.getItem().getPrice() * this.getCount();
    }

    public StringBuffer printDetail() {
        StringBuffer detail = new StringBuffer("");
        detail.append(this.getItem().getName());
        detail.append(" x ");
        detail.append(this.getCount());
        detail.append(" = ");
        detail.append(this.getTotal());
        detail.append("元");
        return detail;
    }

    public static void test() {
        Dish dish0 = new Dish("ITEM0001 x 2");
        System.out.println(dish0.getCount());
        System.out.println(dish0.getItem().getPrice());
    }
}
