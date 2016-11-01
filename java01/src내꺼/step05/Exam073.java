package step05;

public class Exam073 {
  public static void main(String[] args) {
    int i = -1;
    while (i < 10) {
      i++;
      if (i == 3)
        continue;
      if (i == 7)
        break;
      System.out.println(i);
    }
  }
}
