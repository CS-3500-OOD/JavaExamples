package cs3500.coupling.carparts;

public class Engine {

  private final int horsePower;

  public Engine (int hp) {
    System.out.printf("Creating a car engine with %d hp...\n", hp);
    horsePower = hp;
  }

  public void start() {
    System.out.printf("Starting the %d hp engine...\n", horsePower);
  }

  public void drive(int speed) {
    System.out.printf("We are going to drive at %d mph...\n", speed);
  }

}
