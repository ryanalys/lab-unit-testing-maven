package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  /** @Test
  public void test2() {
    assertEquals(10, 3*5, "stupid test");
} // test2()*/

@Test
public void c2ftest(){
  assertEquals(32, SampleMethods.c2f(0), "0 degrees C is 32 F");
}

@Test
public void c2ftest2(){
  assertEquals(212, SampleMethods.c2f(100), "100C is 212F");
}

@Test
public void sumtest() {
  int[] values = {1, 2, 3};
  assertEquals(6, SampleMethods.sum(values), "sum of {1, 2, 3} is 6");
}

@Test
public void sumtest2() {
  int[] values = {9000, 300, 12};
  assertEquals(9312, SampleMethods.sum(values), "sum of {9000, 300, 12} is 9312");
}

@Test
public void testExtremes() {
  int tmp = Integer.MAX_VALUE - 10;
  int[] values = { tmp, tmp, -tmp, -tmp };
  assertEquals(0, SampleMethods.sum(values), "extreme values");
} // testExtremes

@Test
public void exptTestPositive(){
  int expected = 1;
  for(int base = 1; base<5; base++){
    for(int power=0; power<5; power++){
      assertEquals(expected, SampleMethods.expt(base, power), "Testing expt on positive bases");
      expected = expected * expected;
    }
  }
  expected = 1;
}

@Test
public void exptTestNegative(){
  int expected = -1;
  for(int base = -5; base<0; base++){
    for(int power=0; power<5; power++){
      assertEquals(expected, SampleMethods.expt(base, power), "Testing expt on negative bases");
      expected = expected * expected;
    }
  }
  expected = -1;
}

@Test
public void exptTestZero(){
  int expected = 0;
  for(int power = 0; power<5; power++){
    assertEquals(expected, SampleMethods.expt(0, power), "Any expt with base 0 is zero");
  }
}

 /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs

  /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveBs() {
    assertEquals("", 
                 SampleMethods.removeBs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeBs("hello"),
                 "no bs");
    assertEquals("", 
                 SampleMethods.removeBs("b"),
                 "eliminate one b");
    assertEquals("", 
                 SampleMethods.removeBs("bbbb"),
                 "eliminate many bs");
    assertEquals("pin", 
                 SampleMethods.removeBs("pbin"),
                 "eliminate one b, short string");
    assertEquals("lphet", 
                 SampleMethods.removeBs("blphbbet"),
                 "eliminate many bs, medium string");
    assertEquals("ACDC",
                 SampleMethods.removeBs("bbbbbAbbbbbbCbbbbbbDbbbbbCbbbbbb"),
                 "eliminate many bs, silly string");
    assertEquals("aaa",
                 SampleMethods.removeBs("bbbaaabbb"),
                 "eliminate prefix and suffix bs");
  } // testRemoveAs

} // class TestSampleMethods



