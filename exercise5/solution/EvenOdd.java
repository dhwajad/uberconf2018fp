package com.agiledeveloper;

import java.util.*;
import static java.util.stream.Collectors.*;

class EvenOdd {
  public static List<Integer> evenAndOddCount(List<Integer> numbers) {
    Map<Boolean, Long> partitioned =
      numbers.stream()
        .collect(partitioningBy(e -> e % 2 == 0, counting()));
        
    return Arrays.asList(partitioned.get(false).intValue(),
      partitioned.get(true).intValue());
  }
}