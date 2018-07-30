package com.agiledeveloper;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;

import java.util.*;                     

//import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
public class TripleTest {
  @Test
  void numberAtPosition() {
    assertAll(
      () -> assertEquals(Arrays.asList("3 4 5"), Triple.computeTriples(1))
      , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10"), Triple.computeTriples(2))
      , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13"), Triple.computeTriples(3))
      , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13", "15 8 17"), Triple.computeTriples(4))
      , () -> assertEquals(Arrays.asList("3 4 5", "8 6 10", "5 12 13", "15 8 17", "12 16 20"), Triple.computeTriples(5))
      , () -> assertEquals(10, Triple.computeTriples(10).size())
      , () -> assertTrue(Triple.computeTriples(10).contains("21 20 29"))
      , () -> assertEquals(20, Triple.computeTriples(20).size())
      , () -> assertTrue(Triple.computeTriples(20).contains("45 28 53"))
    );
  }

  @Test
  void scratch() {
    System.out.println(Triple.computeTriples(1));
  }
}