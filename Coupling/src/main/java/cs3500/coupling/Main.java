package cs3500.coupling;

import cs3500.coupling.basiccar.BasicCar;
import cs3500.coupling.carparts.Engine;
import cs3500.coupling.carparts.Radio;
import cs3500.coupling.premiumcar.PremiumCar;
import cs3500.coupling.simplecar.SimpleCar;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    System.out.println("Basic Car...");
    BasicCar basic = new BasicCar();
    basic.drive();
    System.out.println();

    System.out.println("Simple Car");
    SimpleCar s = new SimpleCar();
    s.drive();
    System.out.println();

    System.out.println("Premium Car");
    List<String> favStations = new ArrayList<>();
    favStations.add("90.1");
    favStations.add("101.3");
    favStations.add("97.1");
    Radio premiumRadio = new Radio(favStations);
    int premiumHp = 325;
    Engine premiumEngine = new Engine(premiumHp);

    PremiumCar premiumCar = new PremiumCar(premiumEngine, premiumRadio);
    premiumCar.drive();
  }
}



