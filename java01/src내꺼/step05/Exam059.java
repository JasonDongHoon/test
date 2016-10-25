package step05;

public class Exam059 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18) {
      System.out.println("----------------");
      System.out.println("미성년");
      System.out.println("----------------");
    } else {
      System.out.println("----------------");
      System.out.println("성년");
      System.out.println("----------------");
    }
  }
}
