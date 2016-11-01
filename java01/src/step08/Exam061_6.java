/* 주제: 객체지향 핵심 문법 - 클래스 정리 6
인스턴스 변수를 메서드에서 쉽게 다루고 싶다.
인스턴스 메서드로 만들라!
static 을 붙이지 말아라.
단 호출할 때 인스턴스 주소를 메서드 앞에 둔다.
그리고 메서드는 내장 변수 this에 주소를 저장한다.
*/
package step08;

public class Exam061_6 {

  static class Calculator{
    int sum = 0;

    void plus(int a) {this.sum += a;}
    void minus(int a) {this.sum -= a;}
    void multiple(int a) {this.sum *= a;}
    void divide(int a) {this.sum /= a;}
  }

  public static void main(String[] args) {
// 두 개의 계산식의 결과를 저장할 메모리를 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(3);
    c1.plus(2);
    c1.minus(1);
    c1.multiple(3);

    c2.plus(4);
    c2.multiple(5);
    c2.divide(2);
    c2.minus(7);

    System.out.println(c1.sum);
    System.out.println(c2.sum);

}
}
