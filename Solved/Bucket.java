package Solved;

import java.util.LinkedList;
import main.java.uq.comp3506.wk04.Help;

public class Bucket {
  public static void sort(char[] me) {
    @SuppressWarnings("unchecked") // Silence the typechecker
    LinkedList<Character>[] buckets = (LinkedList<Character>[]) new LinkedList<?>[Help.ENGLISH_NUMBER_OF_LETTERS];
    // Fill the buckets
    for (int i = 0; i < Help.ENGLISH_NUMBER_OF_LETTERS; i++) {
      buckets[i] = new LinkedList<>();
    }
    for (int i = 0; i < me.length; i++) {
      buckets[Help.charToIndex(me[i])].add(me[i]);
    }
    // Tip out the buckets
    int i = 0;
    for (int b = 0; b < buckets.length; b++) {
      for (Character c : buckets[b]) {
        me[i] = c;
        i += 1;
      }
    }
    return;
  }
}