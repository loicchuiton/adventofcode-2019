package december.first;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class SecondPuzzleTest {

  private Logger logger = LogManager.getLogger(SecondPuzzleTest.class);

  @Test
  void test1() {
    Assertions.assertEquals(2, SecondPuzzle.proceed(12));
  }

  @Test
  void test2() {
    Assertions.assertEquals(2, SecondPuzzle.proceed(14));
  }

  @Test
  void test3() {
    Assertions.assertEquals(966, SecondPuzzle.proceed(1969));
  }

  @Test
  void test4() {
    Assertions.assertEquals(50346, SecondPuzzle.proceed(100756));
  }

  @Test
  void finalTest() {
    double result =
        Stream.of(
                82406, 83106, 120258, 142695, 50629, 117793, 81165, 83442, 70666, 94355, 64069,
                72830, 88813, 148762, 90723, 121206, 57713, 116892, 82470, 101686, 83768, 92160,
                91532, 136997, 142382, 120050, 81062, 106227, 112071, 102275, 54033, 109059, 91772,
                63320, 81872, 52925, 92225, 60053, 110402, 97125, 87404, 54970, 66662, 83979, 88474,
                91361, 69272, 61559, 56603, 96324, 66226, 95278, 105643, 139141, 116838, 130717,
                97708, 108371, 73652, 100518, 98295, 63127, 50486, 121157, 109721, 110874, 124791,
                147116, 127335, 65889, 76769, 100596, 79740, 125860, 120185, 73861, 97700, 147169,
                106781, 71891, 64744, 107113, 59274, 77680, 101891, 69848, 98922, 147825, 128315,
                55221, 119892, 87492, 75814, 80350, 131504, 81095, 57344, 63765, 143915, 126768)
            .map(SecondPuzzle::proceed)
            .reduce(Double.valueOf("0"), Double::sum);

    logger.debug("Result for 2nd Puzzle is {}", result);
    // Added after for refactoring
    double expected = 4717699;
    Assertions.assertEquals(expected, result);
  }
}
