package step04;

public class Exam039 {
  public static void main(String[] args) {
    int a = 20;
    int r = a++ + a++ + a++ + a++;
    System.out.printf("a=%d, r=%d\n", a, r);
  }
}
