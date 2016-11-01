package step05;

public class Exam070 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 5)
          break;
        System.out.printf(">%d\n", j);
      }
      System.out.printf("[%d]\n", i);
    }
  }
}
