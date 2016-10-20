package test;
// 2016.10.19 수요일

public class Exam017 {
  public static void main(String[] args) {

// 결과를 리턴하는 명령어 (expression 표현식, 식)
// 프로그램 언어로 작성하는 명령어(statement 문장)


// (10 < 20) ? System.out.println("10 < 20") : System.out.println("10 >=20"); 컴파일 오류!!
/* int age = 10;
   String result = (age < 19) ? "미성년" : "성년";
   System.out.println(result); OK!! */

    int age = 10;
    String result = (age < 19) ? "미성년" : "성년";
    System.out.println(result);
  }
}
