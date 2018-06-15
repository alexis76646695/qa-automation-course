package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class Int2LcdTest {

  @Test
  public void testIfNumberIsOne() {
    Int2Lcd int2Lcd = new Int2Lcd();
    Assert.assertTrue(int2Lcd.isNumberOne(1));
  }
}
