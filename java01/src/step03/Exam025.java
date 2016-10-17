public class Exam025 {
  public static void main(String[] args) {

    int kor, eng, math, sci, soc, mus, art;
    // 같은 데이터 타입의 메모리를 한 번에 선언하는 방법을 "배열"이라 부른다.

    // 1) 배열을 가리킬 변수를 선언
    int[] scores;
    /* 배열을 가리키는 이름을 선언하는 것이다.
       - 아직 어떤 배열을 가리킬 지 지정하지 않았기 때문에 사용할 수 없다.
     */

    // 2) 배열을 준비한다.
    scores = new int[7];
    // new int[7] ==> int 메모리 7 개를 준비하라!
    // scores라는 이름을 가리키겠다는 의미이다.

    // 배열 선언 단축 문법
    // => 배열을 가리키는 변수와 배열을 준비하는 명령어를 한 번에 작성할 수 있다.
    int[] scores2 = new int[7];
  }
}
