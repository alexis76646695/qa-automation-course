package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

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
  public void testGivenAThenIsDigit() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isDigit('a'));
  }
}
