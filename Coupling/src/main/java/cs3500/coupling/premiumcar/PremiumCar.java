package cs3500.coupling.premiumcar;

import cs3500.coupling.carparts.Engine;
import cs3500.coupling.carparts.Radio;

public class PremiumCar {
  private final Engine engine;
  private final Radio radio;

  public PremiumCar(Engine e, Radio r) {
    if(e == null || r == null) {
      throw new IllegalArgumentException("Cannot build a car with null engine or radio");
    }
    engine = e;
    radio = r;
  }

  public void drive() {
    engine.start();
    radio.setVolume(15);
    radio.playFavoriteStation(1);
    engine.drive(45);
  }
}
