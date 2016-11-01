/* 주제: 객체지향 핵심 문법 - 클래스 정리 2

*/
package step08;

public class Exam061_2 {

  static class Calculator{
    static int plus(int a, int b) { return a + b;}
    static int minus(int a, int b) { return a - b;}
    static int multiple(int a, int b) { return a * b;}
    static int divide(int a, int b) { return a / b;}
  }
  public static void main(String[] args) {

    int sum = 0;
    sum = Calculator.plus(3,2);
    sum = Calculator.multiple(sum, 3);
    sum = Calculator.minus(sum, 1);
    System.out.println(sum);

  }




}
