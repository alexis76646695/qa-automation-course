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

    public boolean isNumberSix(int number) {
        return number == 6;
    }

    public boolean isNumberSeven(int number) {
        return number == 7;
    }

    public boolean isNumberEight(int number) {
        return number == 8;
    }

    public boolean isNumberNine(int number) {
        return number == 9;
    }

    public boolean isDigit(char letter) {
        return Character.isDigit(letter);
    }

    public List<String> convertDigitToLcd(int number) {
        List<String> numbersLcd = new ArrayList<>();
        if (isNumberOne(number)) {
            numbersLcd = this.getNumberOneLcd();
        }
        if (isNumberTwo(number)) {
            numbersLcd = this.getNumberTwoLcd();
        }
        if (isNumberThree(number)) {
            numbersLcd = this.getNumberThreeLcd();
        }
        if (isNumberFour(number)) {
            numbersLcd = this.getNumberFourLcd();
        }
        if (isNumberFive(number)) {
            numbersLcd = this.getNumberFiveLcd();
        }
        if (isNumberSix(number)) {
            numbersLcd = this.getNumberSixLcd();
        }
        if (isNumberSeven(number)) {
            numbersLcd = this.getNumberSevenLcd();
        }
        return numbersLcd;
    }

    private List<String>  getNumberOneLcd() {
        List<String> numbersOneLcd = new ArrayList<>();
        numbersOneLcd.add(" ");
        numbersOneLcd.add("|");
        numbersOneLcd.add("|");
        return numbersOneLcd;
    }

    private List<String>  getNumberTwoLcd() {
        List<String> numberTwoLcd = new ArrayList<>();
        numberTwoLcd.add("_");
        numberTwoLcd.add("_|");
        numberTwoLcd.add("|_");
        return numberTwoLcd;
    }

    private List<String>  getNumberThreeLcd() {
        List<String> numberThreeLcd = new ArrayList<>();
        numberThreeLcd.add("_");
        numberThreeLcd.add("_|");
        numberThreeLcd.add("_|");
        return numberThreeLcd;
    }

    private List<String>  getNumberFourLcd() {
        List<String> numberFourLcd = new ArrayList<>();
        numberFourLcd.add(" ");
        numberFourLcd.add("|_|");
        numberFourLcd.add(" |");
        return numberFourLcd;
    }

    private List<String>  getNumberFiveLcd() {
        List<String> numberFiveLcd = new ArrayList<>();
        numberFiveLcd.add("_");
        numberFiveLcd.add("|_");
        numberFiveLcd.add("_|");
        return numberFiveLcd;
    }

    private List<String>  getNumberSixLcd() {
        List<String> numberSixLcd = new ArrayList<>();
        numberSixLcd.add("_");
        numberSixLcd.add("|_");
        numberSixLcd.add("|_|");
        return numberSixLcd;
    }

    private List<String>  getNumberSevenLcd() {
        List<String> numberSevenLcd = new ArrayList<>();
        numberSevenLcd.add("_");
        numberSevenLcd.add("|");
        numberSevenLcd.add("|");
        return numberSevenLcd;
    }
}
