package cs3500.innerclassexample;

public class Person {

  class Email {
    private String userName;
    private String domain;
    public Email(String u, String d) {
      userName = u;
      domain = d;
    }

    public String toString() {
      return userName + "@" + domain;
    }
  }

  private String name;
  private Email address;

  public Person (String n, String u, String d) {
    name = n;
    address = new Email(u, d);
  }

  public String toString () {
   return "[" + name + ", " + address + "]";
  }
}
