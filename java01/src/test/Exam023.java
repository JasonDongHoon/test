package test;
// 2016.10.19 수요일

public class Exam023 {
  public static void main(String[] args) {
    byte[] language = new byte[] {
      //Java, Javascript, HTML, CSS, C, C++, PHP, Python, perl, VB,
      //R, Groovy, XML, Scala, Ruby, Swift, object-C, Pascal, C#, Go

      1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    };
    // Java, C, C++ 할 줄 아는사람 검사

  /*  int v1 = (language[0]) ? 1 : 0;
    int v2 = ((language[4]) ? 1 : 0);
    int v3 = ((language[5]) ? 1 : 0);
    String result = (v1 + v2 + v3 == 3) ? "Yes" : "No";
    System.out.println(result);*/

   int v1 = language[0] + language[4] + language[5];
   String result = (v1 == 3) ? "Yes" : "No";
   System.out.println(result);

  }
}
