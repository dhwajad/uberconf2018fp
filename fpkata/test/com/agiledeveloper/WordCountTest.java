package com.agiledeveloper;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;

import java.io.*;
import java.nio.file.NoSuchFileException;

//import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
public class WordCountTest {
  @Test
  void noFile() {
    Exception ex = assertThrows(NoSuchFileException.class, () -> WordCount.count("nofile", ""));
    
    assertTrue(ex instanceof NoSuchFileException);
  } 
  
  @Test
  void wordCount() {
    assertAll(
      () -> assertEquals(0, WordCount.count("/Users/dkulkarn/svn/uberconf2018fp/exercise2/file1.txt", "lambda"))
      , () -> assertEquals(1, WordCount.count("/Users/dkulkarn/svn/uberconf2018fp/exercise2/file2.txt", "lambda"))
      , () -> assertEquals(3, WordCount.count("/Users/dkulkarn/svn/uberconf2018fp/exercise2/file3.txt", "lambda"))
      , () -> assertEquals(0, WordCount.count("/Users/dkulkarn/svn/uberconf2018fp/exercise2/WordCount.java", "lambda"))
      , () -> assertEquals(5, WordCount.count("/Users/dkulkarn/svn/uberconf2018fp/exercise2/WordCountTest.java", "lambda"))
    );
  }
}

