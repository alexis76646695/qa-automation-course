package edu.alsie.tdd.int2lcd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALEXIS ARDAYA on 14/6/2018.
 */
public class Int2Lcd {
    public boolean isNumberOne(int number) {
        return number == 1;
    }

    public boolean isNumberTwo(int number) {
        return number == 2;
    }

    public boolean isNumberThree(int number) {
        return number == 3;
    }

    public boolean isNumberFour(int number) {
        return number == 4;
    }

    public boolean isNumberFive(int number) {
        return number == 5;
    }

    public boolean isDigit(char letter) {
        return Character.isDigit(letter);
    }

    public List<String> convertDigitToLcd(int number) {
        List<String> numberOneLcd = new ArrayList<>();
        if (isNumberOne(number)) {
            numberOneLcd.add(" ");
            numberOneLcd.add("|");
            numberOneLcd.add("|");
            return numberOneLcd;
        }
        return numberOneLcd;
    }
}
