/* 주제: 객체지향 핵심 문법 - 클래스 정리 5
값을 개별적으로 관리하고 싶다면 스태틱 변수로 만들지말고, 인스턴스 변수로 만들라!!
*/
package step08;

public class Exam061_5 {

  static class Calculator{
/* 스태틱 변수
    클래스를 실행할 때(로딩할 때) Method Area 영역에 자동으로 준비된다.
    new 라는 명령에서는 제외된다.
    클래스에 한 개만 존재한다.
*/

    int sum = 0;

    static void plus(Calculator that, int a) {that.sum += a;}
    static void minus(Calculator that, int a) {that.sum -= a;}
    static void multiple(Calculator that, int a) {that.sum *= a;}
    static void divide(Calculator that, int a) {that.sum /= a;}
  }

  public static void main(String[] args) {
// 두 개의 계산식의 결과를 저장할 메모리를 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 3);
    Calculator.plus(c1, 2);
    Calculator.minus(c1, 1);
    Calculator.multiple(c1, 3);
    System.out.println(c1.sum);


    Calculator.plus(c2, 4);
    Calculator.multiple(c2, 5);
    Calculator.divide(c2, 2);
    Calculator.minus(c2, 7);
    System.out.println(c2.sum);

}
}
