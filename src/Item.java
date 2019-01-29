import java.util.Enumeration;
import java.util.Vector;

public class Item {
    private String id;
    private String name;
    private float price;
    public Item(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public static Vector allItems = new Vector();

    public static void test() {
        Item item0 = new Item("ITEM0001", "黄焖鸡", 18.00f);
        Item item1 = new Item("ITEM0013", "肉夹馍", 6.00f);
        Item item2 = new Item("ITEM0022", "凉皮", 8.00f);
        Item item3 = new Item("ITEM0030", "冰锋", 2.00f);
        allItems.add(item0);
        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        Enumeration<Item> enume = allItems.elements();
        while(enume.hasMoreElements()) {
            Item element = enume.nextElement();
            System.out.print(element.getId() + ' ');
            System.out.print(element.getName() + ' ');
            System.out.print(element.getPrice());
            System.out.print('\n');
        }
    }
}
