package december.third;

import java.util.*;

class SecondPuzzle {

  public int proceed(String[] firstPath, String[] secondPath) {
    Map<String, Integer> test = new HashMap<>();
    int centralX = 0;
    int centralY = 0;
    int nbMove = 0;
    for (String movement : firstPath) {
      String direction = movement.substring(0, 1);
      int distance = Integer.parseInt(movement.substring(1));

      for (int k = 0; k < distance; k++) {
        nbMove++;
        switch (direction) {
          case "R":
            centralX++;
            break;
          case "U":
            centralY++;
            break;
          case "D":
            centralY--;
            break;
          case "L":
            centralX--;
            break;
          default:
            break;
        }
        test.put(centralX + "-" + centralY, nbMove);
      }
    }

    centralX = 0;
    centralY = 0;
    nbMove = 0;
    Set<Integer> nbMoveToCross = new HashSet<>();
    for (String movement : secondPath) {
      String direction = movement.substring(0, 1);
      int distance = Integer.parseInt(movement.substring(1));

      for (int k = 0; k < distance; k++) {
        nbMove++;
        switch (direction) {
          case "R":
            centralX++;

            break;
          case "U":
            centralY++;
            break;
          case "D":
            centralY--;
            break;
          case "L":
            centralX--;
            break;
          default:
            break;
        }

        if (test.get(centralX + "-" + centralY) != null) {
          nbMoveToCross.add(test.get(centralX + "-" + centralY) + nbMove);
        }
      }
    }

    return Collections.min(nbMoveToCross);
  }
}
