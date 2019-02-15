package main.java.fung.service;

import main.java.fung.model.Order;
import main.java.fung.service.DiscountHalf;
import main.java.fung.service.Minus6;

public class BestCharge {

    public static String getBill(String[] inputStr) {
        StringBuffer bill = new StringBuffer("============= 订餐明细 =============\n");
        Order order = new Order(inputStr);
        bill.append(order.printDetail());
        bill.append("-----------------------------------\n");
        Minus6 promotionMinus6 = new Minus6();
        DiscountHalf promotionDiscountHalf = new DiscountHalf();
        double discount6 = promotionMinus6.computeDiscount(order);
        double discountHalf = promotionDiscountHalf.computeDiscount(order);
        double discount = 0.0;
        if (discount6 != 0.0 && discountHalf != 0.0) {
            if (discount6 >= discountHalf) {
                discount = discount6;
                bill.append("使用优惠:\n" +
                        "满30减6元，省6元\n" +
                        "-----------------------------------\n");
            } else {
                discount = discountHalf;
                bill.append("使用优惠:\n" +
                        "指定菜品半价(" +
                        String.join(",", promotionDiscountHalf.getSpecialItemNames(order)) +
                        "),省" +
                        discountHalf +
                        "元\n" +
                        "-----------------------------------\n");
            }
        }
        double finalPay = order.getTotal() - discount;
        bill.append("总计：" + finalPay + "元\n" +
                "===================================");
        return bill.toString();
    }

    public static void main(String[] args) {
        String[] input0 = {"ITEM0001 x 1", "ITEM0013 x 2", "ITEM0022 x 1"};
        System.out.print(getBill(input0));
        System.out.println();
        String[] input1 = {"ITEM0013 x 4", "ITEM0022 x 1"};
        System.out.print(getBill(input1));
        System.out.println();
        String[] input2 = {"ITEM0013 x 4"};
        System.out.print(getBill(input2));
    }
}
