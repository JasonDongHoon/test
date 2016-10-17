package step04;
//주제: 형변환 - 명시적 형변환

public class Exam050 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;

    // 명시적 형변환 전
    double r1 = a / b; // int / int => int
    System.out.println(r1);

    // 명시적 형변환 후
    double r2 = (double)a / (double)b; // double / double => double
    System.out.println(r2);
  }
}

/*
r2 = (double)a / (double)b;
1) double 임시메모리(tmp0) 생성
2) tmp0 <= a값
3) double 임시메모리(tmp1) 생성
4) tmp1 <= b값
5) r2 = tmp0 / tmp1

형변환은 원래 변수의 종류를 바꾸는 것이 아니라,
임시 메모리를 만들어 값을 넣는 것을 말한다.

명시적 형변환 범위
- char, byte, short, int, long, float, double 끼리 가능




*/
