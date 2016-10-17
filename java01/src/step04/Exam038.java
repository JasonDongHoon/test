package step04;
//주제: 연산자 - 후위 증가/감소 연산자2

public class Exam038 {
  public static void main(String[] args) {
    // 문제 의도?
    // => 배정 연산자가 맨 마지막에 수행되는 것을 알고 있는가!
    // => r-value 가 모두 수행된 후 = 연산자가 수행된다.
    int a = 20;
    a = a++;
    System.out.println(a);
    /* 분석
    a = a++;
    1) a = 20
    2) a = a + 1 => 21
    3) a <= 20
    print(a) = 20
    */
  }
}

/*






*/
