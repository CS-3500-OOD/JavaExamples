package cs3500.examples;


/**
 * ScheduleOfClasses instantiates one object as part of the field declaration (c1),
 * another instance field c2 is allocated inside the constructor
 * and yet a 3rd (c3) is delcared and allocated inside the constructor.
 */
public class ScheduleOfClasses {

  private Course c1 = new Course("OOD");
  private Course c2;

  /**
   * Attempts to demonstrate the order of object creation
   */
  public ScheduleOfClasses () {
    c2 = new Course("Database Systems");
    Course c3 = new Course ("C++");

    System.out.printf("%nC1 = %s, C2 = %s, C3 = %s", c1.getName(), c2.getName(), c3.getName());
  }

}
