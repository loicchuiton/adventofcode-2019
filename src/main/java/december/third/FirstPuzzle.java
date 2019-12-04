package december.third;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class FirstPuzzle {

  public int proceed(String[] firstPath, String[] secondPath) {
    Set<String> test = new HashSet<>();
    Set<Integer> result = new HashSet<>();
    int positionX = 0;
    int positionY = 0;

    // First Path
    for (String movement : firstPath) {
      String direction = movement.substring(0, 1);
      int distance = Integer.parseInt(movement.substring(1));

      for (int k = 0; k < distance; k++) {

        switch (direction) {
          case "R":
            positionX++;
            break;
          case "U":
            positionY++;
            break;
          case "D":
            positionY--;
            break;
          case "L":
            positionX--;
            break;
          default:
            break;
        }
        test.add(positionX + "-" + positionY);
      }
    }

    // Second Path
    positionX = 0;
    positionY = 0;
    for (String movement : secondPath) {
      String direction = movement.substring(0, 1);
      int distance = Integer.parseInt(movement.substring(1));

      for (int k = 0; k < distance; k++) {
        switch (direction) {
          case "R":
            positionX++;

            break;
          case "U":
            positionY++;
            break;
          case "D":
            positionY--;
            break;
          case "L":
            positionX--;
            break;
          default:
            break;
        }

        if (test.contains(positionX + "-" + positionY)) {
          result.add(Math.abs(positionX) + Math.abs(positionY));
        }
      }
    }
    return Collections.min(result);
  }
}
