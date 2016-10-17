public class Exam029 {
  public static void main(String[] args) {
    int[] scores;

    scores = new int[3];
    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    // 실행 오류가 난다. 인덱스가 범위를 벗어났다.

    // scores가 다른 배열 메모리를 가리킨다.
    scores = new int[5];
    scores[0] = 50;
    scores[1] = 20;
    scores[2] = 30;
    scores[3] = 40;
    scores[4] = 50;
    System.out.println(scores[2]);
    System.out.println(scores[4]);

/*scores[2]의 경우 중복인 상황이다. 이 경우 제일 마지막에 쓴 값이 표시된다.*/

  }
}
