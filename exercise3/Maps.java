package com.agiledeveloper;

import java.util.*;

public class Maps {
  public static Map<Integer, List<String>> listByScore(Map<String, Integer> scores) {
    Map<Integer, List<String>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      List<String> names = new ArrayList<>();
      if(byScores.containsKey(score))
        names = byScores.get(score);

      names.add(name);
      byScores.put(score, names);
    }                            

    return byScores;
  }

  public static Map<Integer, Set<String>> setByScore(Map<String, Integer> scores) {
    Map<Integer, Set<String>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      Set<String> names = new HashSet<>();
      if(byScores.containsKey(score))
        names = byScores.get(score);

      names.add(name.toUpperCase());
      byScores.put(score, names);
    }                            

    return byScores;
  }

  public static Map<Integer, Integer> countScores(Map<String, Integer> scores) {
    Map<Integer, Integer> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      int count = 0;
      if(byScores.containsKey(score))
        count = byScores.get(score);

      byScores.put(score, count + 1);
    }                            

    return byScores;
  }

  public static Map<Integer, Set<Integer>> numberOfLetters(Map<String, Integer> scores) {
    Map<Integer, Set<Integer>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      Set<Integer> letters = new HashSet<>();
      if(byScores.containsKey(score))
        letters = byScores.get(score);

      letters.add(name.length());
      byScores.put(score, letters);
    }                            

    return byScores;
  }

  public static Map<Integer, Integer> maxNumberOfLetters(Map<String, Integer> scores) {
    Map<Integer, Integer> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      int maxLength = 0;
      if(byScores.containsKey(score))
        maxLength = byScores.get(score);
                          
      maxLength = maxLength < name.length() ? name.length() : maxLength;
      byScores.put(score, maxLength);
    }                            

    return byScores;
  }
}