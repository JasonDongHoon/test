package step03;

public class Exam029 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[3];

    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;

    scores = new int[5];
    scores[0] = 50;
    scores[1] = 20;
    scores[2] = 30;
    scores[3] = 40;
    scores[4] = 50;

    System.out.println(scores[2]);
    System.out.println(scores[4]);

  }
}
