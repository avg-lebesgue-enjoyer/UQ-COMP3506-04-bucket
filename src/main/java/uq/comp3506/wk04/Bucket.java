package main.java.uq.comp3506.wk04;

import java.util.LinkedList;

public class Bucket {
  /**
   * Uses bucket sort to sort the given {@code char[]}, where each of the characters is guaranteed to be
   * a lowercase English alphabet character.
   * There is one bucket for each of the lowercase characters {@code 'a'}, {@code 'b'}, ..., {@code 'z'}.
   * @param me The array to sort. We guarantee that {@code me[i]} is one of the characters {@code 'a'},
   *  ..., {@code 'z'} for each {@code i = 0, 1, ..., me.length - 1}.
   */
  public static void sort(char[] me) {
    /* Tips:
     * - `int Help.ENGLISH_NUMBER_OF_LETTERS` exists
     * - You may find `void LinkedList.add(Character)` useful
     * - You may find `int Help.charToIndex(char)` useful
     */
    @SuppressWarnings("unchecked") // Silence the typechecker
    LinkedList<Character>[] buckets = (LinkedList<Character>[]) new LinkedList<?>[Help.ENGLISH_NUMBER_OF_LETTERS];
    // TODO: Implement the rest of the method!
    return;
  }
}