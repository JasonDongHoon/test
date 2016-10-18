package test;
// 2016.10.18 화요일

public class Exam003 {

  static class Score {
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {

  Score s1 = new Score();

    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3;

    System.out.println(s1.aver);
  }
}
