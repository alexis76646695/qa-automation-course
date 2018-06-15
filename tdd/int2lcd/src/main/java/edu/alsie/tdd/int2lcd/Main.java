package edu.alsie.tdd.int2lcd;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> numberLcd;

        Int2Lcd int2Lcd = new Int2Lcd();
        numberLcd = int2Lcd.convertDigitToLcd(1);
        for (int i = 0; i < numberLcd.size(); i++) {
            System.out.println(numberLcd.get(i));
        }
    }
}
