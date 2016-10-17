package step04;
//주제: 연산자 - 산술 연산자

public class Exam035 {
  public static void main(String[] args) {
    //1) 문자열 + 문자열 = 문자열
    String s1 = "홍길동";
    String s2 = "임꺽정";
    String s3 = s1 + s2; // 두 문자열을 연결한 새 문자열 생성
    System.out.println(s3);

    //2) 문자열 + 숫자 = 문자열
    String s4 = "30";
    int i = 20;
    System.out.println(s4 + i);
    // 분석: 숫자가 문자열로 변경되고 두 문자열을 합쳐 새 문자열을 생성한다.

    //3) 숫자 + 문자열 = 문자열
    System.out.println(i + s4);
    // 분석: i의 값을 문자열로 만든 후, 두 문자열을 합쳐 새 문자열을 생성한다.



  }
}

/*






*/
