package com.agiledeveloper;

import java.util.*;

class Fibonacci {
  public static int numberAtPosition(int position) {
    int current = 1;
    int next = 1;
    
    if(position < 2) return 1;
    
    for(int i = 2; i <= position; i++) {
      int temp = current + next;
      current = next;
      next = temp;
    }             
    
    return next;
  }             
  
  public static List<Integer> seriesUntilPosition(int position) {
    List<Integer> result = new ArrayList<>();
    
    if(position >= 0)
      result.add(1);
      
    if(position >= 1)
      result.add(1);
                  
    for(int i = 2; i <= position; i++) {
      result.add(result.get(result.size() - 1) + result.get(result.size() - 2));
    }
    
    return result;
  } 
}