package com.agiledeveloper;

import java.util.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Maps {
  public static Map<Integer, List<String>> listByScore(Map<String, Integer> scores) {
    return scores.keySet()
      .stream()
      .collect(groupingBy(scores::get));
  }

  public static Map<Integer, Set<String>> setByScore(Map<String, Integer> scores) {
    return scores.keySet()
      .stream()
      .collect(
        groupingBy(scores::get, mapping(String::toUpperCase, toSet())));
  }

  public static Map<Integer, Integer> countScores(Map<String, Integer> scores) {
    //return scores.keySet()
    //  .stream()
    //  .collect(groupingBy(
    //    scores::get, collectingAndThen(counting(), Long::intValue)));
                   
    //Rob and Phillipa's solution:    
    return scores.keySet()
      .stream()
      .collect(groupingBy(scores::get, summingInt(ignore -> 1)));
  }

  public static Map<Integer, Set<Integer>> numberOfLetters(Map<String, Integer> scores) {
    return scores.keySet()
      .stream()
      .collect(groupingBy(scores::get, 
         mapping(String::length, toSet())));
  }

  public static Map<Integer, Integer> maxNumberOfLetters(Map<String, Integer> scores) {
    return scores.keySet()
      .stream()
      .collect(groupingBy(scores::get,
        collectingAndThen(maxBy(comparing(String::length)),
          name -> name.orElse("").length())));
  }
}