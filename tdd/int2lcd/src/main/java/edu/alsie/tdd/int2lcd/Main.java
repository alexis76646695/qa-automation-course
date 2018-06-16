package edu.alsie.tdd.int2lcd;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<String>> numberslcd = new ArrayList<>();
        List<String> head = new ArrayList<>();
        List<String> middle = new ArrayList<>();
        List<String> footer = new ArrayList<>();
        Int2Lcd int2Lcd = new Int2Lcd();

        for (int i = 0; i < 10; i++) {
            numberslcd.add(int2Lcd.convertDigitToLcd(i));
        }

        for (int x = 1; x < numberslcd.size(); x++) {
            head.add(numberslcd.get(x).get(0));
            middle.add(numberslcd.get(x).get(1));
            footer.add(numberslcd.get(x).get(2));
        }

        print_numbers_lcd(head, middle, footer);
    }

    private static void print_numbers_lcd(List<String> head, List<String> middle, List<String> footer) {
        print_list(head);
        System.out.println(' ');
        print_list(middle);
        System.out.println(' ');
        print_list(footer);
    }

    private static void print_list(List<String> list) {
        for (int x = 0; x < list.size(); x++) {
            System.out.printf(list.get(x));
        }
    }
}
