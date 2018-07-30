package com.agiledeveloper;

import static java.util.stream.Collectors.*;

import java.util.*;

class EvenOdd {
  public static List<Integer> evenAndOddCount(List<Integer> numbers) {

    Map<Boolean, Long> partitioned =
            numbers.stream()
                    .collect(partitioningBy(e -> e % 2 != 0, counting()));

    partitioned.keySet()
            .stream()
            .collect(groupingBy(toList()));

    return Arrays.asList(partitioned.get(false).intValue(),
            partitioned.get(true).intValue());

    /*for(int e : numbers) {
      if(e % 2 == 0)
        even++;
      else
        odd++;
    }*/
    
    /*return Arrays.asList((int)numbers.stream()
            .filter(number -> number % 2 != 0)
            .count(), (int)numbers.stream()
            .filter(number -> number % 2 == 0)
            .count());*/
  }
}