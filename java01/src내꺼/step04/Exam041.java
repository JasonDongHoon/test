package step04;

public class Exam041 {
  public static void main(String[] args) {
    int a = 3;
    int r = a++ + a++ * a++ - a++;
    System.out.printf("a = %d, r = %d\n", a, r);

    a = 3;
    r = a++ - a++ * (a++ + a++);
    System.out.printf("a = %d, r = %d\n", a, r);
  }
}
