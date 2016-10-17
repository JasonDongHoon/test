package test01;

public class Exam035 {
  static class Score {

    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {

    Score S1 = new Score();
    Score S2 = new Score();

    S1.kor = 100;
    S1.eng = 80;
    S1.math = 100;
    S1.sum = S1.kor + S1.eng + S1.math;
    S1.aver = S1.sum / 3;
    System.out.println(S1.aver);

    S2.kor = 100;
    S2.eng = 80;
    S2.math = 100;
    S2.sum = S2.kor + S2.eng + S2.math;
    S2.aver = S2.sum / 3;
    System.out.println(S2.aver);

    }
}
