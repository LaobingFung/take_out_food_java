import java.util.Vector;

public class DiscountHalf extends Promotion {
    public DiscountHalf() {
        super("指定菜品半价");
    }

    public static Vector<Item> specialList = new Vector<Item>();

    public static void initSpecialList() {
        Item item0 = new Item("ITEM0001", "黄焖鸡", 18.00f);
        Item item1 = new Item("ITEM0022", "凉皮", 8.00f);
        specialList.add(item0);
        specialList.add(item1);
    }

    public static Vector<String> getSpecialItemNames(Order order) {
        Vector<String> specialItemNames = new Vector<String>();
        for(Dish dish : order.getOrder()) {
            for(Item specialItem : specialList) {
                if(dish.getItem().getId().equals(specialItem.getId())) {
                    specialItemNames.add(specialItem.getName());
                }
            }
        }
        return specialItemNames;
    }

    @Override
    public double computeDiscount(Order order) {
        double discount = 0.0;
        for(Dish dish : order.getOrder()) {
            for(Item specialItem : specialList) {
                if(dish.getItem().getId().equals(specialItem.getId())) {
                    discount += dish.getTotal() * 0.5;
                }
            }
        }
        return discount;
    }

    public static void test() {
        String[] input = {"ITEM0001 x 1", "ITEM0013 x 2", "ITEM0022 x 1"};
        Order order = new Order(input);
        DiscountHalf promotion1 = new DiscountHalf();
        System.out.println(promotion1.getType());
        System.out.println(promotion1.computeDiscount(order));
//        for(String str : promotion1.getSpecialItemNames(order)) {
//            System.out.println(str);
//        }
        System.out.println(String.join(",", promotion1.getSpecialItemNames(order)));
    }
}
