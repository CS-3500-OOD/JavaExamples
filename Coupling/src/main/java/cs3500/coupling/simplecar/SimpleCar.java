package cs3500.coupling.simplecar;

import cs3500.coupling.carparts.Engine;
import cs3500.coupling.carparts.Radio;

import java.util.ArrayList;
import java.util.List;

public class SimpleCar {

  private final Engine engine;
  private final Radio radio;

  public SimpleCar() {
    List<String> radioStations = new ArrayList<>();
    radioStations.add("98.5");
    radioStations.add("91.9");
    radioStations.add("90.9");
    radio = new Radio(radioStations);

    int horsePower = 230;
    engine = new Engine(horsePower);
  }

  public void drive() {
    engine.start();
    radio.setVolume(15);
    radio.playFavoriteStation(1);
    engine.drive(45);
  }

}
