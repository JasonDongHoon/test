package step04;
//주제: 연산자 - 조건 연산자 사용법

public class Exam044 {
  public static void main(String[] args) {
    // 조건에 따라 간단한 명령을 실행할 때 사용
    // condition ? expression A : expression B
    // expression(표현식)? 결과를 리턴하는 명령문.
    int age = 19;
    System.out.printf("성인인가요? %s\n", (age >= 18) ? "예" : "아니오" );

    // 다음은 문법 오류이다!
    //(age >= 18) ? System.out.println("예") : System.out.println("아니오");

    System.out.printf("당신이 내야할 버스 요금은 %d입니다.\n",
      (age >= 18) ? 2500 : 1700);
  }
}

/*






*/
