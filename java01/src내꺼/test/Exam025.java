package test;
// 2016.10.19 수요일

public class Exam024 {
  public static void main(String[] args) {
    int[] language = new int[] {
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
    System.out.println(result); */

   int language = 0b00000000_00001111_11111101_10001100;
   String result = (language & 0x00_08_C0_00 == 0x00_08_C0_00) ? "Yes" : "No";

   int v1 = (language & );
   String result = (v1 == 3) ? "Yes" : "No";
   System.out.println(result);

  }
}
