package com.agiledeveloper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WordCount {


  public static long count(String path, String searchWord) throws IOException {
    return Files.lines(Paths.get(path))
            .filter(line -> line.contains(searchWord))
            .count();
    /*try {
      BufferedReader bufferedReader =
        new BufferedReader(new FileReader(path));
      
      String line = null;

      long count = 0;
      while((line = bufferedReader.readLine()) != null) {
        if(line.contains(searchWord))
          count++;
      }
      
      return count;
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }*/
  }
}