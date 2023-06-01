package cs3500.coupling;

import cs3500.coupling.basiccar.BasicCar;
import cs3500.coupling.simplecar.SimpleCar;

public class Main {
  public static void main(String[] args) {

    System.out.println("Basic Car...");
    BasicCar basic = new BasicCar();
    basic.drive();

//    System.out.println("Simple Car");
//    SimpleCar s = new SimpleCar();
//    s.drive();
  }
}