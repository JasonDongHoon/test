package step04;
//주제: 연산자 - main() 파라미터와 조건 연산자 응용

public class Exam046 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    System.out.printf("성인인가요? %s\n", (age >= 18) ? "예" : "아니오" );

    System.out.printf("당신이 내야할 버스 요금은 %d입니다.\n",
      (age >= 18) ? 2500 : 1700);
  }
}

/*






*/
