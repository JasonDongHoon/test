package test;
// 2016.10.18 화요일

public class Exam008 {
/*학생정보
이름, 나이, 주소, 이메일, 주민번호, 폰번호,
*/
static class Student {
    String name;
    int age;
    String postno;
    String baseAddress;
    String detailAddress;
    String school;
    boolean working;
    String tel;
    String email;

  }
    public static void main(String[] args) {

    Student s1 = new Student();
      s1.name = "홍길동";
      s1.age = 20;
      s1.postno = "12345";
      s1.baseAddress = "경기도";
      s1.detailAddress = "삼성동";
      s1.school = "비트대학교";
      s1.working = false;
      s1.tel = "1111-1111";
      s1.email = "hong@test.com";

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.postno);
    System.out.println(s1.baseAddress);
    System.out.println(s1.detailAddress);
    System.out.println(s1.school);
    System.out.println(s1.working);
    System.out.println(s1.tel);
    System.out.println(s1.email);

  }
}
