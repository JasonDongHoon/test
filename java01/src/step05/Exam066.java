package step05;

public class Exam066 {
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);

    int temp = count;
    while (temp > 0) {
      System.out.println(temp);
      temp--;
    }
    System.out.println("-----------------------");
    temp = count;
    while (temp > 0)
      System.out.println(temp--);

  }
}
