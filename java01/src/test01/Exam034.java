package test01;

public class Exam034 {
      static class Score {
      static int kor;
      static int eng;
      static int math;
      static int sum;
      static float aver;
      }

  public static void main(String[] args) {
    Score.kor = 100;
    Score.eng = 90;
    Score.math = 100;
    Score.sum = Score.kor + Score.eng + Score.math;
    Score.aver = Score.sum / 3;

    System.out.println(Score.aver);

  }
}
