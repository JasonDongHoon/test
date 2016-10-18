package step04;

public class Exam037 {
  public static void main(String[] args) {
    int a = 20;
    System.out.println(a++);
    System.out.println(a);

    a = 20;
    int b = a++;
    System.out.printf("a=%d, b=%d\n", a, b);

    a = 20;
    b = a--;
    System.out.printf("a=%d, b=%d\n", a, b);
  }
}
