package december.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstPuzzleTest {

  @Test
  void test1() {
    int[] test = {2, 3, 0, 3, 99};
    int[] expected = {2, 3, 0, 6, 99};
    Assertions.assertArrayEquals(expected, FirstPuzzle.proceed(test));
  }

  @Test
  void test2() {

    int[] test = {1, 0, 0, 0, 99};
    int[] expected = {2, 0, 0, 0, 99};
    Assertions.assertArrayEquals(expected, FirstPuzzle.proceed(test));
  }

  @Test
  void test3() {

    int[] test = {2, 4, 4, 5, 99, 0};
    int[] expected = {2, 4, 4, 5, 99, 9801};
    Assertions.assertArrayEquals(expected, FirstPuzzle.proceed(test));
  }

  @Test
  void test4() {

    int[] test = {1, 1, 1, 4, 99, 5, 6, 0, 99};
    int[] expected = {30, 1, 1, 4, 2, 5, 6, 0, 99};
    Assertions.assertArrayEquals(expected, FirstPuzzle.proceed(test));
  }
}
