package step04;
//주제: 연산자 - 산술 연산자 우선순위

public class Exam040 {
  public static void main(String[] args) {
    // 산술 연산자 우선순위
    // *, /, % 는 나온 순서대로 먼저 계산
    // +, - 나온 순서대로 먼저 계산
    int r = 3 + 2 * 3 - 6 / 2;
    System.out.println(r);
    /* 분석
    r = 3 + 2 * 3 - 6 / 2;
    r = 3 + 6 - 3;
    r = 9 - 3;
    r = 6
    */

    //괄호는 산술 연사자 보다 우선한다.
    r = 3 + 2 * (3 - 6) / 2;
    System.out.println(r);
    /* 분석
    r = 3 + 2 * -3 / 2;
    r = 3 + -6 / 2;
    r = 3 + -3;
    r = 0;
    */
  }
}

/*






*/
