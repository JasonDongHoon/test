public class Exam028 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[3];

    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;

    // 만약 배열 크기를 벗어나는 위치를 지정한다면?
    scores[3] = 70; // 컴파일 오류가 아니라 실행 오류이다.

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    System.out.println(scores[3]);

    /*컴파일은 되는데 실행 시 오류가 발생한다. scores[3]은 없는 폴더인데
    가리키라고 했으니 말이다. "인덱스 범위를 벗어났다"고 표현한다.*/
  }
}
