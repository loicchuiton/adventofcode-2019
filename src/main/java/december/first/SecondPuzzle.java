package december.first;

class SecondPuzzle {
  private SecondPuzzle() {}

  static double proceed(double mass) {
    double fuelRequiredForModule = (Math.floor(mass / 3) - 2);
    if (fuelRequiredForModule < 0) {
      return 0;
    }

    return proceed(fuelRequiredForModule) + fuelRequiredForModule;
  }
}
