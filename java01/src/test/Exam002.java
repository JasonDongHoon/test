package test;
// 2016.10.18 화요일

public class Exam002 {
  public static void main(String[] args) {
    int[] scores = new int[3];  //대부분 이 형식을 사용
    //int scores[] = new int[3]; 이것도 가능하므로 헷갈리지 말자
    scores[0] = 100;
    scores[1] = 100;
    scores[2] = 100;
//  kor = 100, eng = 100, math = 100; 컴파일 오류!!

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);

    int age, weight, height;
  }
}
