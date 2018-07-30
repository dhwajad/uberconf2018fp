package com.agiledeveloper;

import static java.util.stream.Collectors.*;

import java.util.*;
import java.util.stream.Collectors;

public class Maps {
  public static Map<Integer, List<String>> listByScore(Map<String, Integer> scores) {
    return scores.keySet()
            .stream()
            .collect(Collectors.groupingBy(scores::get));
    /*Map<Integer, List<String>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      List<String> names = new ArrayList<>();
      if(byScores.containsKey(score))
        names = byScores.get(score);

      names.add(name);
      byScores.put(score, names);
    }                            

    return byScores;*/
  }

  public static Map<Integer, Set<String>> setByScore(Map<String, Integer> scores) {
    return scores.keySet()
            .stream()
            .collect(
                    groupingBy(scores::get, mapping(String::toUpperCase, toSet())));
    /*Map<Integer, Set<String>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      Set<String> names = new HashSet<>();
      if(byScores.containsKey(score))
        names = byScores.get(score);

      names.add(name.toUpperCase());
      byScores.put(score, names);
    }                            

    return byScores;*/
  }

  public static Map<Integer, Integer> countScores(Map<String, Integer> scores) {
    /*return scores.keySet()
            .stream()
            .collect(groupingBy(scores::get, collectingAndThen(counting(), Long::intValue)));*/

    return scores.keySet()
            .stream()
            .collect(groupingBy(scores::get, summingInt(val -> 1)));
    /*Map<Integer, Integer> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      int count = 0;
      if(byScores.containsKey(score))
        count = byScores.get(score);

      byScores.put(score, count + 1);
    }                            

    return byScores;*/
  }

  public static Map<Integer, Set<Integer>> numberOfLetters(Map<String, Integer> scores) {
    return scores.keySet()
            .stream()
            .collect(
                    groupingBy(scores::get, mapping(String::length, toSet())));
    /*Map<Integer, Set<Integer>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      Set<Integer> letters = new HashSet<>();
      if(byScores.containsKey(score))
        letters = byScores.get(score);

      letters.add(name.length());
      byScores.put(score, letters);
    }                            

    return byScores;*/
  }

  public static Map<Integer, Integer> maxNumberOfLetters(Map<String, Integer> scores) {
    return scores.keySet()
            .stream()
            .collect(groupingBy(scores::get,
                    collectingAndThen(maxBy(Comparator.comparing(String::length)),
                            name -> name.orElse("").length())));
    /*Map<Integer, Integer> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      int maxLength = 0;
      if(byScores.containsKey(score))
        maxLength = byScores.get(score);
                          
      maxLength = maxLength < name.length() ? name.length() : maxLength;
      byScores.put(score, maxLength);
    }                            

    return byScores;*/
  }
}