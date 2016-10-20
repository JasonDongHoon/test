package test;
// 2016.10.19 수요일

public class Exam020 {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int result = (num1 < num2) ? num2 : num1;
    System.out.println(result);

    int num3 = Integer.parseInt(args[0]);
    int num4 = Integer.parseInt(args[1]);
    String result1 = (num3 > num4) ? args[1] : args[0];
    System.out.println(result1);

  }
}
