package test01;

public class Exam033 {
  public static void main(String[] args) {
    //정수
    byte b = 127; //1바이트
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;

    //부동소수점
    float f = 3.14159f;
    double d = 3.14159;

    //논리값
    boolean bool = true;
    boolean bool2 = false;
    //boolean bool3 = 0; 컴파일 오류

    //문자
    char c = 0xAC00;
    char c2 = 44032;
    char c3 = '\uAC00';
    char c4 = '가';

    //문자열
    String str = "홍길동";

  }
}
/* 단정도 - 32비트(4바이트) 부동소수점 유효자릿수 7자리
   배정도 - 64비트(8바이트) 부동소수점 유효자릿수 15자리*/
