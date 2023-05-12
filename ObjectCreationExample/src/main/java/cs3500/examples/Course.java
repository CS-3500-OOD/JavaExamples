package cs3500.examples;

/**
 * Simple class to represent a university course.
 */
public class Course {

  private final String courseName;

  /**
   * Initializes the course name with param n
   * @param n name of the course.
   */
  public Course(String n) {
    System.out.println("Constructor for Course Object: " + n);
    courseName = n;
  }

  /**
   *
   * @return returns the courseName
   */
  public String getName() {
    return courseName;
  }

}
