package com.agiledeveloper;

/*
With IntelliJ IDEA (community [free] edition) will work for this
create a Java Project
Create a test directory
Mark test directory as test source
Copy this file into test/com/agiledeveloper directory
Add reference to the jar files in the lib directory
Run the test
*/

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;

import java.util.*;                     

//import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
public class WarmupTest {
  @Test
  void canary() {
    assertTrue(true);
  }
}
