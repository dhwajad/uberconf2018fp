package com.agiledeveloper;

import java.io.*;
import java.nio.file.*;

public class WordCount {   
  public static long count(String path, String searchWord) {
    try {
      return Files.lines(Paths.get(path))
        .filter(line -> line.contains(searchWord))
        .count();
    } catch(Exception ex) {
      throw new RuntimeException(new FileNotFoundException(ex.getMessage()));
    }
  }
}