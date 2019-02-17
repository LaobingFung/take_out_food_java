package main.java.fung;

import java.lang.String;

import java.util.Scanner;

import static main.java.fung.service.BestCharge.getBill;

public class Main {
    public static void main(String[] args) {
        Tool.initAllItems();
        Tool.initSpecialItems();
        Scanner scan = new Scanner(System.in);
        System.out.println("请点餐：");
        if (scan.hasNextLine()) {
            String strInput = scan.nextLine();
            System.out.println(getBill(strInput.split(", ")));
        }
        scan.close();
    }
}
