package step03;

public class Exam031 {
  public static void main(String[] args) {
    int[][] scores = new int[5][3];

    scores[0][0] = 100;
    scores[0][1] = 100;
    scores[0][2] = 100;

    scores[1][0] = 90;
    scores[1][1] = 90;
    scores[1][2] = 90;

    scores[2][0] = 80;
    scores[2][1] = 80;
    scores[2][2] = 80;

    scores[3][0] = 70;
    scores[3][1] = 70;
    scores[3][2] = 60;

    scores[4][0] = 60;
    scores[4][1] = 60;
    scores[4][2] = 60;

    System.out.println(scores[3][2]);
  }
}
