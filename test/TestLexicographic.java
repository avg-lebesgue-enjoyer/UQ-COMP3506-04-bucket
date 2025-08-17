package test;

import java.util.Arrays;

import main.java.uq.comp3506.wk04.Lexicographic;

public class TestLexicographic {
  private static void feedback(String[] input, String[] expectedResult, String[] actualResult) {
    if (Arrays.deepEquals(expectedResult, actualResult)) {
      System.out.println("\t\t<?> Success!");
    } else {
      System.err.println("\t\t<?> FAILED.");
      System.err.println("\t\t<?> For input:\t" + Arrays.toString(input));
      System.err.println("\t\t<?> Expected result:\t" + Arrays.toString(expectedResult));
      System.err.println("\t\t<?> But actually got:\t" + Arrays.toString(actualResult));
    }
  }

  public static void main(String[] args) {
    String[] input;
    String[] expectedResult;
    String[] actualResult;
    System.out.println("<?> Testing lexicographic sort...");

    System.out.println("\t<?> Empty array...");
    input = new String[] {};
    expectedResult = new String[] {};
    actualResult = input.clone();
    Lexicographic.sort(actualResult, 0);
    feedback(input, expectedResult, actualResult);
    
    System.out.println("\t<?> Length one array...");
    input = new String[] {"p"};
    expectedResult = new String[] {"p"};
    actualResult = input.clone();
    Lexicographic.sort(actualResult, 1);
    feedback(input, expectedResult, actualResult);

    System.out.println("\t<?> Real stuff...");
    input = new String[] {
      "according",
      "toallknow",
      "nlawsofav",
      "iationthe"
    };
    expectedResult = new String[] {
      "according",
      "iationthe",
      "nlawsofav",
      "toallknow"
    };
    actualResult = input.clone();
    Lexicographic.sort(actualResult, 9);
    feedback(input, expectedResult, actualResult);

    System.out.println("<?> Testing done!");
  }
}