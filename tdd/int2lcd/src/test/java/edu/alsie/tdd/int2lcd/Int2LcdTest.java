package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Int2LcdTest {

  @Test
  public void testIfNumberIsOne() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isNumberOne(1));
  }

  @Test
  public void testIfNumberIsTwo() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isNumberTwo(2));
  }

  @Test
  public void testIfNumberIsThree() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isNumberThree(3));
  }

  @Test
  public void testIfNumberIsFour() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isNumberFour(4));
  }

  @Test
  public void testGivenAThenNotIsDigit() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertFalse(int2Lcd.isDigit('a'));
  }

  @Test
  public void testGiven1ThenConvertToLcd() {
    Int2Lcd int2Lcd = new Int2Lcd();
    List<String> expected = Arrays.asList("_","| |","_");
    List<String> actual = int2Lcd.convertDigitToLcd(1);
    Assert.assertEquals(expected, actual);
  }
}
