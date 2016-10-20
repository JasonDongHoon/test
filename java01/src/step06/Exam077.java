package step06;

public class Exam077 {
  public static void main(String[] args) {
    int result = Exam077.plus(10, 20);
    System.out.println(result);

    int result2 = Other.minus(10, 20);
    System.out.println(result2);
  }

  static int plus(int a, int b) {
    int sum = a + b;
    return sum;
  }
}
