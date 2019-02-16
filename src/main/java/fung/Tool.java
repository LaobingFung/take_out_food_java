package main.java.fung;

import main.java.fung.model.Item;
import main.java.fung.service.DiscountHalf;

public class Tool {
    public static void initAllItems() {
        Item item0 = new Item("ITEM0001", "黄焖鸡", 18.00f);
        Item item1 = new Item("ITEM0013", "肉夹馍", 6.00f);
        Item item2 = new Item("ITEM0022", "凉皮", 8.00f);
        Item item3 = new Item("ITEM0030", "冰锋", 2.00f);
        Item.allItems.add(item0);
        Item.allItems.add(item1);
        Item.allItems.add(item2);
        Item.allItems.add(item3);
    }

    public static void initSpecialItems() {
        Item item0 = new Item("ITEM0001", "黄焖鸡", 18.00f);
        Item item1 = new Item("ITEM0022", "凉皮", 8.00f);
        DiscountHalf.specialList.add(item0);
        DiscountHalf.specialList.add(item1);
    }

}
