package december.second;

class SecondPuzzle {
  private SecondPuzzle() {}

  static int[] proceed(int[] intCode, int wantedOutcome) {
    for (int i = 1; i < 99; i++) {
      for (int j = 1; j < 99; j++) {
        int[] intCodeTemp = intCode.clone();
        intCodeTemp[1] = i;
        intCodeTemp[2] = j;

        FirstPuzzle.proceed(intCodeTemp);

        if (intCodeTemp[0] == wantedOutcome) {
          return intCodeTemp;
        }
      }
    }
    return new int[] {};
  }
}
