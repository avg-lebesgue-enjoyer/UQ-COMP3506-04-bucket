package test;

import java.util.Arrays;

import main.java.uq.comp3506.wk04.Bucket;

public class TestBucket {
  private static void feedback(char[] input, char[] expectedResult, char[] actualResult) {
    if (Arrays.equals(expectedResult, actualResult)) {
      System.out.println("\t\t<?> Success!");
    } else {
      System.err.println("\t\t<?> FAILED.");
      System.err.println("\t\t<?> For input:\t" + Arrays.toString(input));
      System.err.println("\t\t<?> Expected result:\t" + Arrays.toString(expectedResult));
      System.err.println("\t\t<?> But actually got:\t" + Arrays.toString(actualResult));
    }
  }

  public static void main(String[] args) {
    char[] input;
    char[] expectedResult;
    char[] actualResult;
    System.out.println("<?> Testing bucket sort...");

    System.out.println("\t<?> Empty array...");
    input = new char[] {};
    expectedResult = new char[] {};
    actualResult = input.clone();
    Bucket.sort(actualResult);
    feedback(input, expectedResult, actualResult);
    
    System.out.println("\t<?> Length one array...");
    input = new char[] {'p'};
    expectedResult = new char[] {'p'};
    actualResult = input.clone();
    Bucket.sort(actualResult);
    feedback(input, expectedResult, actualResult);

    System.out.println("\t<?> Real stuff...");
    input = new char[] {
      'a', 'c', 'c', 'o', 'r', 'd', 'i', 'n', 'g', 't', 'o', 'a', 'l', 'l', 'k',
      'n', 'o', 'w', 'n', 'l', 'a', 'w', 's', 'o', 'f', 'a', 'v', 'i', 'a', 't',
      'i', 'o', 'n'
    };
    expectedResult = new char[] {
      'a', 'a', 'a', 'a', 'a', 'c', 'c', 'd', 'f', 'g', 'i', 'i', 'i', 'k', 'l',
      'l', 'l', 'n', 'n', 'n', 'n', 'o', 'o', 'o', 'o', 'o', 'r', 's', 't', 't',
      'v', 'w', 'w'
    };
    actualResult = input.clone();
    Bucket.sort(actualResult);
    feedback(input, expectedResult, actualResult);

    System.out.println("<?> Testing done!");
  }
}