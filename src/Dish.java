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

    public static void test() {
        Dish dish0 = new Dish("ITEM0001 x 2");
        System.out.println(dish0.getCount());
        System.out.println(dish0.getItem().getPrice());
    }
}
