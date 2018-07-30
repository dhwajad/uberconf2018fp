package com.agiledeveloper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Triple {
  public static String getTriple(int m, int n) {   
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;
    
    return String.format("%d %d %d", a, b, c);
  }
  
  public static List<String> computeTriples(int numberOfValues) {

    IntStream.range(1, numberOfValues)
            .mapToObj(n -> Triple.getTriple(n+1, n))
            .forEach(string -> System.out.println(string));
    return Stream.iterate(2, e -> e +1)
            .flatMap(m ->
              IntStream.range(1, m)
                .mapToObj(n -> getTriple(m, n)))
            .limit(numberOfValues)
            .collect(Collectors.toList());
    /*List<String> triples = new ArrayList<>();
    int count = 1;
    
    for(int m = 2; ; m++) {
      for(int n = 1; n < m; n++) {
        triples.add(getTriple(m, n));        
        count++;
        
        if(count > numberOfValues)
          break;
      }
      
      if(count > numberOfValues)
        break;
    }
    
    return triples;*/
  }  
}