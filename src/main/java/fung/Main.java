package main.java.fung;

import static main.java.fung.service.BestCharge.getBill;

public class Main {
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
