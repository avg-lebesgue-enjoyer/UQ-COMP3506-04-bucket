package main.java.uq.comp3506.wk04;

import java.util.LinkedList;

public class Lexicographic {

  /**
   * Uses lexicographic sort to sort the given {@code String[]}, where each of the {@code String}s has
   * the same length {@code length}, and each character of each string is guaranteed to be a lowercase
   * English alphabet character.
   * @param me The array to sort.
   * @param length The length of each element of {@code me}.
   * @requires {@code me[i].length == length} for each {@code i = 0, 1, ..., me.length - 1}.
   * @requires {@code me[i].charAt(j)} is one of the chracters {@code 'a'}, ..., {@code 'z'} for each
   *           {@code i = 0, 1, ..., me.length - 1} and each {@code j = 0, 1, ..., length - 1}.
   */
  public static void sort(String[] me, int length) {
    /* Tips:
     * - You may want to implement the helper method `private void help(String[], int)` below
     */
    // TODO: Implement the algorithm!
    return;
  }

  /**
   * Sorts the given {@code String[]}, comparing only the characters at index {@code whichCharacter}.
   * <p>
   * For instance, if {@code whichCharacter == 0}, then {@code me} will be sorted in such a way that the
   * first characters of each string appear sorted.
   * <p>
   * Examples: {@code me == ["sus", "amo", "spa"]} becomes...
   * <ul>
   *  <li>
   *    {@code ["amo", "spa", "sus"]} if {@code whichCharacter == 0}
   *  </li>
   *  <li>
   *    {@code ["amo", "spa", "sus"]} if {@code whichCharacter == 1}
   *  </li>
   *  <li>
   *    {@code ["spa", "amo", "sus"]} if {@code whichCharacter == 2}
   *  </li>
   * </ul>
   * <p>
   * The implementation should be a stable sort.
   * 
   * @param me The array to sort.
   * @param whichCharacter The index of the characters to sort by
   */
  public static void help(String[] me, int whichCharacter) {
    /* Tips:
     * - You may find it useful to modify your solution to `Bucket.java`.
     * - You may want to test this method separately before implementing `lexicographicSort`!
     *   There are some tests in `test/TestLexicographic.java` for this.
     */
    // TODO: Implement!
    return;
  }
}