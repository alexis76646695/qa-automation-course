package edu.alsie.tdd.int2lcd;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> numberLcd;

        Int2Lcd int2Lcd = new Int2Lcd();
        for (int i = 0 ; i < 10 ; i ++){
            numberLcd = int2Lcd.convertDigitToLcd(i);
            for (int x = 0; x< numberLcd.size(); x++) {
                System.out.println(numberLcd.get(x));
            }
        }

    }
}
