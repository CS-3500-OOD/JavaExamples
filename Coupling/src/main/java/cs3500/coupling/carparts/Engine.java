package cs3500.coupling.carparts;

public class Engine {

  private int horsePower;

  public Engine (int hp) {
    System.out.printf("Creating a car engine with %d hp...\n", hp);
    horsePower = hp;
  }

  public void start() {
    System.out.println("Starting the engine...");
  }

  public void drive(int speed) {
    System.out.printf("We are going to drive at %d mph\n", speed);
  }

}
