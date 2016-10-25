/* 주제: 객체지향 핵심 문법 - 클래스 정리 4
중간 계산 결과를 밖에 두지 말고 그 계산과 관련된 클래스 안에 두자!!
*/
package step08;

public class Exam061_4 {

  static class Calculator{
/* 스태틱 변수
    클래스를 실행할 때(로딩할 때) Method Area 영역에 자동으로 준비된다.
    new 라는 명령에서는 제외된다.
    클래스에 한 개만 존재한다.
*/

    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }

  public static void main(String[] args) {

    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

    Calculator.sum = 0;
    Calculator.plus(4);
    Calculator.multiple(5);
    Calculator.minus(7);
    Calculator.divide(2);
    System.out.println(Calculator.sum);

}
}
