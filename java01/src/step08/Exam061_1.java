/* 주제: 객체지향 핵심 문법 - 클래스 정리 1
클래스는 사용자가 프로젝트의 조건에 맞는 데이터 타입과
그 타입의 데이터를 다루는 연산자를 정의할 때 사용하는 문법이다.
*/
package step08;

public class Exam061_1 {
  public static void main(String[] args) {

int sum = 0;
sum = plus(3,2);
sum = multiple(sum, 3);
sum = minus(sum, 1);
System.out.println(sum);

  }
static int plus(int a, int b) { return a + b;}
static int minus(int a, int b) { return a - b;}
static int multiple(int a, int b) { return a * b;}
static int divide(int a, int b) { return a / b;}



}
