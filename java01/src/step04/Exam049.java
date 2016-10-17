package step04;
//주제: 형변환 - 서로 다른 종류의 값 연산

public class Exam049 {
  public static void main(String[] args) {
    int a = 5;
    double b = 2.5;
    double r = a + b; // 서로 다른 종류의 값 끼리 절대로 연산 할 수 없다.
    System.out.println(r);
    /* 코드 분석:
    r = a + b;
    암시적 형변환 수행:
      임시 double 메모리를 준비한다.
      그 메모리를 tmp0라고 가정하자.
      tmp0 <== a
    r = tmp0(5.0) + b(2.5); 이제 double + double이 가능하다.
    r = 7.5
    */
  }
}

/*
다른 타입끼리 연산이 된다?
- 내부적으로 값의 종류를 변환시키는 과정이 수행된다.
- 이 과정을 "암시적 형변환(implicit type conversion)"이라고 부른다.

주의!
- 형변환의 의미는 임시 메모리를 만든다는 뜻이다.
- 기존 변수의 타입을 변경하는 것이 아니다.
- 숫자만 해당된다.

규칙!
- int ==> double 로 형변환된다.
- double ==> int 로 바뀔 수는 없다.


*/
