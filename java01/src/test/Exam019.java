package test;
// 2016.10.19 수요일

public class Exam019 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    String result = (age < 19) ? "미성년" : "성년";
    System.out.println(result);

  }
}
