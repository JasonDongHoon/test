package step04;
//주제: 연산자 - 후위 증가/감소 연산자

public class Exam037 {
  public static void main(String[] args) {
    int a = 20;

    //1) 후위 연산자 ++
    //=> 변수의 값을 그 자리에 놓는다.
    //=> 그리고 그 변수의 값을 1 증가시킨다.
    System.out.println(a++);
    /* 분석
    1) System.out.println(20);
    2) a = a + 1 => a = 21
    3) println() 실행
    */
    System.out.println(a);

    //2) 후위 연산자와 할당문
    a = 20;
    int b = a++;
    System.out.printf("a=%d, b=%d\n", a, b);
    /* 분석
    b = a++;
    1) b = 20    주의! 오른쪽 문장이 모두 실행될 때 까지 저장은 수행되지 않는다.
    2) a = a + 1
    3) b <= 20
    */

    //3) -- 전위 연산자
    a = 20;
    b = a--;
    System.out.printf("a=%d, b=%d\n", a, b);
    /* 분석
    b = a--;
    1) b = 20
    2) a = a - 1 => a=19
    3) b <= 20
    */
  }
}

/*






*/
