package com.agiledeveloper;

import java.util.*;

class EvenOdd {
  public static List<Integer> evenAndOddCount(List<Integer> numbers) {
    int odd = 0;
    int even = 0;

    for(int e : numbers) {
      if(e % 2 == 0)
        even++;
      else
        odd++;
    }
    
    return Arrays.asList(odd, even);
  }
}