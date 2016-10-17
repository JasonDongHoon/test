package step04;
//주제: 연산자 - 전위 증가/감소 연산자

public class Exam036 {
  public static void main(String[] args) {
    int a = 20;

    //1) 전위 연산자 ++
    //=> 변수의 값을 1 증가시킨다.
    //=> 그리고 그 변수의 값을 그 자리에 놓는다.
    System.out.println(++a);

    //2) 전위 연산자와 할당문
    a = 20;
    int b = ++a;
    System.out.printf("a=%d, b=%d\n", a, b);
    /* 분석
    b = ++a;
    1) a = a + 1  => a=21
    2) b = a
    3) b = 21
    */

    //3) -- 전위 연산자
    a = 20;
    b = --a;
    System.out.printf("a=%d, b=%d\n", a, b);
    /* 분석
    b = --a;
    1) a = a - 1 => a=19
    2) b = a
    3) b = 19
    */
  }
}

/*






*/
