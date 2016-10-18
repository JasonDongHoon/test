package step05;

public class Exam071 {
  public static void main(String[] args) {

    ohora:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 5)
          break ohora;
        System.out.printf(">%d\n", j);
      }
      System.out.printf("[%d]\n", i);
    }
  }
}
