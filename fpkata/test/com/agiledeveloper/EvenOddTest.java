package com.agiledeveloper;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;

import java.util.*;                     

//import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
public class EvenOddTest {
  @Test
  void numberAtPosition() {
    assertAll(
      () -> assertEquals(Arrays.asList(0, 0), EvenOdd.evenAndOddCount(Arrays.asList()))
      , () -> assertEquals(Arrays.asList(1, 0), EvenOdd.evenAndOddCount(Arrays.asList(1)))
      , () -> assertEquals(Arrays.asList(1, 1), EvenOdd.evenAndOddCount(Arrays.asList(1, 2)))
      , () -> assertEquals(Arrays.asList(2, 1), EvenOdd.evenAndOddCount(Arrays.asList(1, 2, 3)))
      , () -> assertEquals(Arrays.asList(1, 4), EvenOdd.evenAndOddCount(Arrays.asList(10, 20, 13, 30, 40)))
      , () -> assertEquals(Arrays.asList(4, 1), EvenOdd.evenAndOddCount(Arrays.asList(11, 21, 13, 31, 40)))
      , () -> assertEquals(Arrays.asList(16, 4), EvenOdd.evenAndOddCount(Arrays.asList(11, 21, 13, 31, 40, 11, 21, 13, 31, 40, 11, 21, 13, 31, 40, 11, 21, 13, 31, 40)))
    );
  }
}

