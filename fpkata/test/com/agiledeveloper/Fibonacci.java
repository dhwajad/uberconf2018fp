package com.agiledeveloper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Tuple {
  public final int first;
  public final int second;

  public Tuple(int theFirst, int theSecond) {
    first = theFirst;
    second = theSecond;
  }

  public Tuple next() {
    return new Tuple(second, first + second);
  }


}

class Fibonacci {
  public static int numberAtPosition(int position) {

    if(position == 0) return 1;

    return Stream.iterate(0, e -> e+1)
            .limit(position - 1)
            .map(ignore -> new Tuple(1, 1))
            .reduce(new Tuple(1, 1), (current, ignore) -> current.next())
            .second;

    /*return Stream.iterate(new Tuple(1, 1), Tuple::next)
            .limit(position - 1)
            .skip(position)
            .findFirst()
            .second;*/

    /*int current = 1;
    int next = 1;
    
    if(position < 2) return 1;



    for(int i = 2; i <= position; i++) {
      int temp = current + next;
      current = next;
      next = temp;
    }

    return next;*/
  }             
  
  public static List<Integer> seriesUntilPosition(int position) {

    /*return Stream.iterate(0, e -> e +1)
            .limit(position + 1)
            .map(Fibonacci::numberAtPosition)
            .collect(Collectors.toList());*/

    return IntStream.rangeClosed(0, position)
            .mapToObj(Fibonacci::numberAtPosition)
            .collect(Collectors.toList());

    /*List<Integer> result = new ArrayList<>();
    
    if(position >= 0)
      result.add(1);
      
    if(position >= 1)
      result.add(1);
                  
    for(int i = 2; i <= position; i++) {
      result.add(result.get(result.size() - 1) + result.get(result.size() - 2));
    }
    
    return result;*/
  } 
}