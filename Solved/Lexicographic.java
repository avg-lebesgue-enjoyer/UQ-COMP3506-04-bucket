package Solved;

import java.util.LinkedList;

import main.java.uq.comp3506.wk04.Help;

public class Lexicographic {

  public static void sort(String[] me, int length) {
    for (int whichCharacter = length - 1; whichCharacter >= 0; whichCharacter -= 1) {
      help(me, whichCharacter);
    }
    return;
  }

  public static void help(String[] me, int whichCharacter) {
    @SuppressWarnings("unchecked") // Silence the typechecker
    LinkedList<String>[] buckets = (LinkedList<String>[]) new LinkedList<?>[Help.ENGLISH_NUMBER_OF_LETTERS];
    // Fill the buckets
    for (int i = 0; i < Help.ENGLISH_NUMBER_OF_LETTERS; i++) {
      buckets[i] = new LinkedList<>();
    }
    for (int i = 0; i < me.length; i++) {
      // NOTE: This is the major change for comparing characters at the index `whichCharacter` only
      //       Everything else is typechecking stuff.
      buckets[Help.charToIndex(me[i].charAt(whichCharacter))].add(me[i]);
    }
    // Tip out the buckets
    int i = 0;
    for (int b = 0; b < buckets.length; b++) {
      for (String s : buckets[b]) {
        me[i] = s;
        i += 1;
      }
    }
    return;
  }

}