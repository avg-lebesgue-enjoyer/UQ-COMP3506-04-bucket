# Tasks
1. In `src/main/java/uq/comp3506/wk04/Bucket.java`, implement **bucket sort** to sort a `char[]`.
2. In `src/main/java/uq/comp3506/wk04/Lexicographic.java`, implement **lexicographic sort** to sort a `String[]`, assuming all strings to have the same length.
3. *(Just for fun!)* Extend your *lexicographic sort* implementation to handle strings of unequal length.

# Testing your code
1. Compile your code. You can do this with any of the following:
  - On unix machines: `./compile.sh` in the terminal
  - In VSCode: `F6` --> "Compile everything!"
  - Anything else: `javac -d out src/main/java/uq/comp3506/wk04/*.java test/*.java` in the terminal
2. Run the associated `test/TestWhatever.java` class. You can do this with any of the following:
  - On unix machines: `./testBucket.sh` or `./testLexico.sh` in the terminal
  - In VSCode: `F6` --> "Run tests in the currently opened file (ensure you've compiled first!)"
  - Anything else:
    - Test bucket sort: `java -cp out -ea TestBucket` in the terminal
    - Test lexicographic sort: `java -cp out -ea TestLexicographic` in the terminal

# Meme
<img src="./bucket.webp" alt="Dear God">
