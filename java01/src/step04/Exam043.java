package step04;
//주제: 연산자 - 논리 연산자 사용법

public class Exam043 {
  public static void main(String[] args) {
    // 여러 개의 조건을 조합할 필요할 있을 때 사용
    // AND, OR
    System.out.printf("T && T ? %b\n", true && true);
    System.out.printf("T && F ? %b\n", true && false);
    System.out.printf("F && T ? %b\n", false && true);
    System.out.printf("F && F ? %b\n", false && false);
    System.out.printf("T || T ? %b\n", true || true);
    System.out.printf("T || F ? %b\n", true || false);
    System.out.printf("F || T ? %b\n", false || true);
    System.out.printf("F || F ? %b\n", false || false);
  }
}

/*






*/
