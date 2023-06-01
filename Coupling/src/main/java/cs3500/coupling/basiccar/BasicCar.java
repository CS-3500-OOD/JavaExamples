package cs3500.coupling.basiccar;

import java.util.ArrayList;
import java.util.List;

public class BasicCar {
  private final List<String> radioStations;
  private int radioVolume;
  private final int engineHorsePower;

  public BasicCar() {
    radioStations = new ArrayList<>();
    radioStations.add("90.9");
    radioStations.add("98.5");
    radioVolume = 10;
    engineHorsePower = 190;
  }

  public void drive() {
    System.out.printf("Starting %d hp engine...\n", engineHorsePower);
    radioVolume = 15;
    System.out.printf("Setting volume to %d...\n", radioVolume);
    System.out.printf("Playing station %s...\n", radioStations.get(1));
    System.out.println("Let's drive away at 40 mph...");
  }


}
