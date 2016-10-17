public class Exam018 {
  public static void main(String[] args) {
    //1) 정수 값을 담을 메모리(4바이트)를 준비
    int i; //정수를 표기(4byte)

    //2) 부동소수점을 담을 메모리(8바이트)를 준비
    double d; //실수를 표기(8byte)

    //3) 논리 값을 담을 메모리를 준비
    boolean b; //논리값을 표기(몇byte??)

    //4) 문자 값을 담을 메모리(2byte)를 준비
    // => JVM 내부에서 문자를 다룰 때 UTF-16을 사용한다.
    char c; //문자를 표기(2byte) 2byte넘는 문자가 존재할 땐 어떻게?

    //5) 문자열을 담을 메모리(주소를 담는)를 준비
    String s; //문자열을 표기(얘는 몇byte??)
  }
}
