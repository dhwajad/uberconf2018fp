package com.agiledeveloper;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

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
    
    return Stream.iterate(0, e -> e + 1)
      .limit(position - 1)
      .map(ignore -> new Tuple(1, 1))
      .reduce(new Tuple(1, 1), (current, ignore) -> current.next())
      .second;

    //return Stream.iterate(new Tuple(1, 1), Tuple::next)
    //  .limit(position - 1)
    //...
  }             
             
  public static List<Integer> seriesUntilPosition(int position) {
    //return Stream.iterate(0, e -> e + 1)
    //  .limit(position + 1)
    //  .map(Fibonacci::numberAtPosition)
    //  .collect(toList());
    
    return IntStream.rangeClosed(0, position)
      .mapToObj(Fibonacci::numberAtPosition)
      .collect(toList());
  } 
}