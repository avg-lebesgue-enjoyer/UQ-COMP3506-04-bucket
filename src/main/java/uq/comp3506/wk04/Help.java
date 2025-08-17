package main.java.uq.comp3506.wk04;

public class Help {
  /** Programmer moment */
  public final static int ENGLISH_NUMBER_OF_LETTERS = 26;

  /**
   * Convert {@code 'a'} to {@code '0'}, convert {@code 'b'} to {@code '1'}, etc.
   * @param me A lowercase English alphabet character
   * @return The position of {@code me} in the alphabet, starting from zero
   */
  public static int charToIndex(char me) {
    return (int) me - (int) 'a';
  }
}
