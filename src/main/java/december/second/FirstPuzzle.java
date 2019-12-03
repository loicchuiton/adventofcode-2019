package december.second;

class FirstPuzzle {

  private FirstPuzzle() {}

  static int[] proceed(int[] intcode) {
    int pos = 0;
    while (intcode[pos] != 99) {
      if (intcode[pos] == 1) {
        intcode[intcode[pos + 3]] = intcode[intcode[pos + 2]] + intcode[intcode[pos + 1]];
      } else if (intcode[pos] == 2) {
        intcode[intcode[pos + 3]] = intcode[intcode[pos + 2]] * intcode[intcode[pos + 1]];
      }

      pos += 4;
    }

    return intcode;
  }
}
