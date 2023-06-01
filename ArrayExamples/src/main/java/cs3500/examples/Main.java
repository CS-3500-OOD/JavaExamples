package cs3500.examples;

public class Main {


  public static void main(String[] args) {
    int[] data2 = new int[] {2, 4, 6, 8};
    int sum = sumElements(data2);
    System.out.println("Sum = " + sum);

    TwoDimArrayExample();
  }

  public static int sumElements(int[] array) {
    int sum = 0;
    for(int element : array) {
      sum += element;
    }
    return sum;
  }

  public static void anotherExample () {
    int[] data = new int[10];
    for (int i = 0; i < 10; i ++) {
      data [i] = i + 5;
    }

    for (int s : data) {
      System.out.println(s);
    }
  }

  public static void TwoDimArrayExample() {
    int[][] data = new int[10][10];
    for(int[] row : data) {
      for(int x : row) {
        System.out.print("" + x + " ");
      }
      System.out.println();
    }
  }
}